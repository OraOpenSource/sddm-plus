/*!
 * This code can be used to set the "Use DDL Transformation Script" property to true for all tables in the Model
 *
 * @author David Schleis
 @
 */

tables.each { table ->
  table.useDDLTransformationScript = true
  table.dirty = true
}
