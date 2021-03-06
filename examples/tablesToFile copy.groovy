/**
 * This script writes a listing of all tables and columns with datatype and size to a file located in the IDE work directory.
 *
 * The IDE work directory can be found using Help->About->Properties->ide.work.dir
 */

// default output directory is IDE work directory
//def outDir = java.lang.System.getProperty('ide.work.dir')

// default output file name is to be <model_name>_MMDDYY.txt
//def outFile = "${model.name}_${new Date().format('MMddyy')}.txt"

//def outputDest = new File("$outDir/$outFile")

//tableListToFile(outputDest)

  tables.each { table ->
    table.columns.each { column ->
      column.with {
        defaultValue = '1'
      }
    }
    table.dirty=true
  }
}
