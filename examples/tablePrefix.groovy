/**
 * Adds a common prefix to all tables in the model that do not already have the prefix.
 *
 * The prefix can optionally be provided as an argument to the method.
 * If the prefix is not provided, the user will be prompted.
 * If the prefix does not end with "_" it will be appended to the prefix.
 * If the table already has the prefix, it is not added again.
 *
 * @param prefix Optional prefix to add to all tables
 */
def addPrefixToTables (String prefix='') {

  if (!prefix) {  // if the prefix is not given, ask for it
    prefix = JOptionPane.showInputDialog("Please provide the table prefix.").toUpperCase()
  }
  if (prefix[-1] != '_') {
    prefix += '_'
  }
  prefix = prefix.toUpperCase()
  model.tableSet.toArray().each { table ->
      if (!table.name.toUpperCase().startsWith(prefix)) {
        table.name = "$prefix${table.name}".toUpperCase()
        table.dirty = true
      }
  }
}

/**
 * Removes a common prefix from all tables in the model that have the prefix.
 *
 * The prefix can optionally be provided as an argument to the method.
 * If the prefix is not provided, the user will be prompted.
 * Unlike the method to add a prefix, this method will not modify the prefix provided in any way.
 *
 * @param prefix Optional prefix to remove from all tables
 */
def dropPrefixFromTables (String prefix='') {

  if (!prefix) {  // if the prefix is not given, ask for it
    prefix = JOptionPane.showInputDialog("Please provide the table prefix.").toUpperCase()
  }

  model.tableSet.toArray().each { table ->
      if (table.name.toUpperCase().startsWith(prefix)) {
        table.name = "${table.name.toUpperCase().substring(prefix.size())}"
        table.dirty = true
      }
  }
}
