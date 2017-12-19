## sddm-plus.groovy methods
<a name="top"/>

### General/Model methods
- [log()](#log)
- [show()](#show)
- [ask()](#ask)
- [getTables()](#getTables)
- [getTableWhereNameEquals()](#getTableWhereNameEquals)
- [getTablesWhereNameLike()](#getTablesWhereNameLike)
- [getTablesWhereNameNotLike()](#getTablesWhereNameNotLike)

### Table methods
- [Table.getColumns()](#getColumns)
- [Table.getColumnWhereNameEquals()](#getColumnWhereNameEquals)
- [Table.getColumnsWhereNameLike()](#getColumnsWhereNameLike)
- [Table.getColumnsWhereNameNotLike()](#getColumnsWhereNameNotLike)
- [Table.addColumn()](#addColumn)
- [Table.dropColumn()](#dropColumn)
- [Table.logProperties()](#logProperties)

### Column methods
- [Column.logProperties()](#colLogProperties)
<a name="log"/>

## log()

<p>
<p>Writes to the Data Modeler log window.</p>
</p>

### Syntax
```groovy
log(String message)
```

### Parameters
Name | Description
--- | ---
message | The message that is displayed in the log window

<a name="show"/>


## show()
<p>
<p>Displays a message in a dialog box.</p>
</p>

### Syntax
```groovy
show (String message)
```

### Parameters
Name | Description
--- | ---
message | The message that is displayed in the dialog box

[Top](#top)

<a name="ask"/>

## ask()

<p>
<p>Displays a message in a dialog box and returns the string that is input.</p>
</p>

### Syntax
```groovy
ask (String question)
```

### Parameters
Name | Description
--- | ---
question | The message that is displayed in the dialog box
*return* |  A String object containing the user input

[Top](#top)

<a name="getTables"/>

## getTables()

<p>
<p>Returns a list of the table objects found in the current relational model.</p>
</p>

### Syntax
```groovy
getTables()
```

### Parameters
Name | Description
--- | ---
*return* | List of Table objects

[Top](#top)

<a name="getTableWhereNameEquals"/>

## getTableWhereNameEquals()

<p>
<p>Returns the table with the given name (case insensitive) found in the current relational model.</p>
</p>

### Syntax
```groovy
getTableWhereNameEquals(String matcher)
```

### Parameters
Name | Description
--- | ---
matcher | A String that is the name of the table
*return* | A Table object

[Top](#top)

<a name="getTablesWhereNameLike"/>

## getTablesWhereNameLike()

<p>
<p>Returns a List of Table objects from the current relational model that match the given matcher (case insensitive).</p>
<p>This method compares the table names with the matcher and returns those table
objects that match.</p>
<p>The matcher is case insensitive and recognizes wildcards of '*' and '%' at the beginning or end and can take several forms.</p>

- A simple string: 'test'
- A string contining a list of comma-seperated values: 'abc, 123, *test'
- A Groovy List of strings: ['abc', '%123', 'test*']

### Syntax
```groovy
getTablesWhereNameLike(matcher)
```

### Parameters
Name | Description
--- | ---
matcher | A String or List
*return* | A List of Table objects

[Top](#top)

<a name="getTablesWhereNameNotLike"/>

## getTablesWhereNameNotLike()

<p>
<p>Returns a List of Table objects from the current relational model that do not match the given matcher (case insensitive).</p>
<p>This method compares the table names with the matcher and returns those table
objects that match.</p>
<p>The matcher is case insensitive and recognizes wildcards of '*' and '%' at the beginning or end and can take several forms.</p>

- A simple string: 'test'
- A string contining a list of comma-seperated values: 'abc, 123, *test'
- A Groovy List of strings: ['abc', '%123', 'test*']
</p>

### Syntax
```groovy
getTablesWhereNameNotLike(matcher)
```

### Parameters
Name | Description
--- | ---
matcher | A String or List
*return* | A List of Table objects

[Top](#top)

<a name="getColumns"/>

## Table.getColumns()

<p>
<p>Returns all columns of a table.</p>
</p>

### Syntax
```groovy
getColumns()
```

### Example
```groovy
getTables().each {table ->
  log ("Table: ${table.name}")
  table.getColumns().each {col ->
    log ("  ${col.name}")
  }
}
// or, using Groovy's "getter as a property" goodness
tables.each {table ->
  log ("Table: ${table.name}")
  table.columns.each {col ->
    log ("  ${col.name}")
  }
}
```

### Parameters
Name | Description
--- | ---
*return* | List of Column objects

[Top](#top)

<a name="getColumnWhereNameEquals"/>

## Table.getColumnWhereNameEquals()

<p>
<p>Returns the column of a table with the given name (case insensitive)</p>
</p>

### Syntax
```groovy
getColumnWhereNameEquals(String matcher)
```

### Parameters
Name | Description
--- | ---
matcher | A String that is the name of the column
*return* | A Column object.

[Top](#top)

<a name="getColumnsWhereNameLike"/>

## Table.getColumnsWhereNameLike()

<p>
<p>Returns a List of Column objects that match the given matcher (case insensitive).</p>
<p>This method compares the column names with the matcher and returns those column objects that match.</p>
<p>The matcher is case insensitive and recognizes wildcards of '*' and '%' at the beginning or end and can take several forms.</p>

- A simple string: 'test'
- A string contining a list of comma-seperated values: 'abc, 123, *test'
- A Groovy List of strings: ['abc', '%123', 'test*']
</p>

### Syntax
```groovy
Table.getColumnsWhereNameLike(matcher)
```

### Parameters
Name | Description
--- | ---
matcher | A String or List
*return* | A List of Column objects

[Top](#top)

<a name="getColumnsWhereNameNotLike"/>

## Table.getColumnsWhereNameNotLike()

<p>
<p>Returns a List of Column objects that do not match the given matcher (case insensitive).</p>
<p>This method compares the column names with the matcher and returns those column objects that do not match.</p>
<p>The matcher is case insensitive and recognizes wildcards of '*' and '%' at the beginning or end and can take several forms.</p>

- A simple string: 'test'
- A string contining a list of comma-seperated values: 'abc, 123, *test'
- A Groovy List of strings: ['abc', '%123', 'test*']
</p>

### Syntax
```groovy
Table.getColumnsWhereNameNotLike(matcher)
```

### Parameters
Name | Description
--- | ---
matcher | A String or List
*return* | A List of Column objects

[Top](#top)

<a name="addColumn"/>

## Table.addColumn()

<p>
<p>Creates a column on the table using the provided information.</p>
<p>This method adds a column to the table. Currently Numeric, Varchar and Date data types are supported.
</p>

### Parameters
Name | Description
--- | ---
colName | The name of the new column
datatype | The data type of the new column
precisionOrSize | The precision of a numeric column, or the size of a varchar. Use '' for date.
scaleOrType | The scale of a numeric column, or the type, byte or char, for a varchar. Use '' for date.

### Syntax
```groovy
Table.addColumn(String colName, String datatype, String precisionOrSize, String scaleOrType)
```

[Top](#top)

<a name="dropColumn"/>

## Table.dropColumn()

<p>
<p>Removes a column from the table based on the name.</p>

<p>This method drops a column from the table.</p>

</p>

### Parameters
Name | Description
--- | ---
colName | The name of the column to be dropped


### Syntax
```groovy
Table.dropColumn(String colName)
```

[Top](#top)

<a name="logProperties"/>

## Table.logProperties()

<p>
<p>Outputs a listing of all properties of the table to the system log.</p>
<p>This method outputs all available properties of the given table to the system log.</p>
<p>This method is designed to allow for easier exploration of available properties, and is meant to be used along side of the index.html documentation file.</p>
<p>Some properties can not be displayed due to insufficient documentation of the getter methods, others may display null values for the same reason.
</p>

### Syntax
```groovy
Table.logProperties()
```
[Top](#top)

<a name="colLogProperties"/>

## Column.logProperties()

<p>
<p>Outputs a listing of all properties of the column to the system log.</p>
<p>This method outputs all available properties of the given column to the system log.</p>
<p>This method is designed to allow for easier exploration of available properties, and is meant to be used along side of the index.html documentation file.</p>
<p>Some properties can not be displayed due to insufficient documentation of the getter methods, others may display null values for the same reason.
</p>

### Syntax
```groovy
Column.logProperties()
```

[Top](#top)
