/**
 * Add and remove standard audit columns from tables in the model.
 *
 * These methods allow for the easy addition and removal of a pre-defiend set of audit columns
 * from a table or tables within your relational model.
 *
 * These methods rely on the SDDM^Plus scripting library, which must be included when using this file.
 * for example, in the Custom Transformation Script window of SDDM you would enter:
 @example
// parse the local copy of the sddm-plus file into a string variable
def sddmPlus = new File('/Users/local/git/sddm-plus/source/sddm-plus.groovy').text

def scrAudit = new File('/Users/local/git/sddm-plus/examples/auditColumns.groovy').text

// parse the script that calls the other methods into a string variable
def scrWork = new File('/Users/local/sddm-plus/scripts/auditCols.groovy').text

// Use the Groovy evaluate method on the concatenated strings
evaluate (sddmPlus+scrAudit+scrWork)
 */

/*
 * This list contains the definition of the audit columns added to tables using the addAuditColumnsToTables method.
 *
 */
def auditCols = [[colName:'USER_CREATED', datatype:'VARCHAR', size:'255', type:'BYTE'],
                [colName:'DATE_CREATED', datatype:'Date', size:'', type:''],
                [colName:'USER_MODIFIED', datatype:'VARCHAR', size:'255', type:'BYTE'],
                [colName:'DATE_MODIFIED', datatype:'Date', size:'', type:'']]

/**
 * Adds standard audit columns to all of the tables in the model if it does not already have them.
 *
 */
def addAuditColumnsToTables (auditCols) {
  tables.each { table ->
    addAuditColumns (table, auditCols)
  }
}

/**
 * Remove standard audit columns to all of the tables in the model if it does not already have them.
 *
 */
def dropAuditColumnsFromTables (auditCols) {
  tables.each { table ->
    dropAuditColumns (table, auditCols)
  }
}

/**
 * Adds standard audit columns to the table if it does not already have them.
 *
 * The method looks only at the column name to determine if the column should be added.
 * The audit columns are defined in the global array *auditCols*.
 * To customize the audit column definitions, this array can be modifed within the user script before calling the method.
 * The default column definitions look like this:
 * @example
 * def auditCols = [[colName:'USER_CREATED', datatype:'VARCHAR', size:'255', type:'BYTE'],
 *                  [colName:'DATE_CREATED', datatype:'Date', size:'', type:''],
 *                  [colName:'USER_MODIFIED', datatype:'VARCHAR', size:'255', type:'BYTE'],
 *                  [colName:'DATE_MODIFIED', datatype:'Date', size:'', type:'']]
 *
 * @param auditCols The global array containing the definitioan of the audit columns
 */
def addAuditColumns (table, auditCols) {
  def columnNames = table.columns.collect {it.name.toUpperCase()}
  // loop through the Audit columns to see if it exists in the table, if not, add it.
  auditCols.each {auditCol ->
    if (!columnNames.contains(auditCol.colName.toUpperCase())) {
      auditCol.with {
        table.addColumn (colName, datatype, size, type)
      }
    }
  }
}

/**
 * Removes the standard audit columns from the indicated table if they exist.
 *
 * The method looks only at the column name to determine if the column should be dropped.
 * The audit columns are defined in the global array *auditCols*.
 * To customize the audit column definitions, this array can be modifed within the user script before calling the method.
 * The default column definitions look like this:
 * @example
 * def auditCols = [[colName:'USER_CREATED', datatype:'VARCHAR', size:'255', type:'BYTE'],
 *                  [colName:'DATE_CREATED', datatype:'Date', size:'', type:''],
 *                  [colName:'USER_MODIFIED', datatype:'VARCHAR', size:'255', type:'BYTE'],
 *                  [colName:'DATE_MODIFIED', datatype:'Date', size:'', type:'']]
 *
 * @param auditCols The global array containing the definitioan of the audit columns
 */
def dropAuditColumns (table, auditCols) {
  def columnNames = table.columns.collect {it.name.toUpperCase()}
  // loop through the Audit columns to see if it exists in the table,  if so, remove it.
  auditCols.each { auditCol ->
    if (columnNames.contains(auditCol.colName.toUpperCase())) {
      table.dropColumn (auditCol.colName)
    }
  }
}
