/*
 * sddm-plus
 * @author  David Schleis dschleis@gmail.com
 * @version 0.1
 * @date 20-Sep-2017
 */

import javax.swing.JOptionPane
import javax.swing.JDialog
import javax.swing.JFrame



/**
 * Displays a message in a dialog box and returns the string that is input.
 *
 * @param question The message that is displayed in the dialog box
 * @return A String object containing the user input
 */
 String ask (String question = 'Please provide input') {
   JOptionPane.showInputDialog(question)
 }

/**
 * Displays a message in a dialog box.
 *
 * @param message The message that is displayed in the dialog box
 */
 Void show (String message) {
    JOptionPane.showMessageDialog(null,message)
 }

 /**
  * Writes to the Data Modeler log window.
  *
  * @param message The message that is displayed in the log window
  */
Void log(String message) {
    def app = oracle.dbtools.crest.swingui.ApplicationView;
    app.log(message)
}

oracle.dbtools.crest.model.design.relational.Table.metaClass {
  logProperties { ->
    log("\n")
    log("name:\t${name}")
    log("Class Table")
    log("abbreviation:\t${delegate?.abbreviation}")
    log("adequatelyNormalized:\t${delegate?.adequatelyNormalized}")
    log("expectedVolumes:\t${delegate?.expectedVolumes}")
    log("growthPercent:\t${delegate?.growthPercent}")
    log("growthType:\t${delegate?.growthType}")
    log("maxVolumes:\t${delegate?.maxVolumes}")
    log("minVolumes:\t${delegate?.minVolumes}")
    log("normalForm:\t${delegate?.normalForm}")
    log("oidIsPK:\t${delegate?.oidIsPK}")
    log("scope:\t${delegate?.scope}")
    log("basedOnStructuredType:\t${delegate?.basedOnStructuredType}")
    log("afterCreate:\t${delegate?.afterCreate}")
    log("beforeCreate:\t${delegate?.beforeCreate}")
    log("beforeDrop:\t${delegate?.beforeDrop}")
    log("endOfScript:\t${delegate?.endOfScript}")
    log("shouldGenerateScript:\t${delegate?.shouldGenerateScript}")
    log("spatialTable:\t${delegate?.spatialTable}")
    log("splittedTableID:\t${delegate?.splittedTableID}")
    log("userDefinedOid:\t${delegate?.userDefinedOid}")
    log("allowColumnReorder:\t${delegate?.allowColumnReorder}")
    log("redactionPolicyName:\t${delegate?.redactionPolicyName}")
    log("redactionPolicyDefaultExpression:\t${delegate?.redactionPolicyDefaultExpression}")
    log("redactionPolicyEnabled:\t${delegate?.redactionPolicyEnabled}")
    log("redactionPolicyGenerateInDDL:\t${delegate?.redactionPolicyGenerateInDDL}")
    log("isEngineerToRelation:\t${delegate?.isEngineerToRelation()}")
    log("existDependencyGenerateInDDl:\t${delegate?.existDependencyGenerateInDDl}")
    log("existDependencyConstraintName:\t${delegate?.existDependencyConstraintName}")
    log("existDependencyGenerationLevel:\t${delegate?.existDependencyGenerationLevel}")
    log("includeSchemaNameInQuery:\t${delegate?.includeSchemaNameInQuery}")
    log("incorrectSQL:\t${delegate?.incorrectSQL}")
    log("materializedQueryTable:\t${delegate?.materializedQueryTable}")
    log("onPrebuiltTable:\t${delegate?.onPrebuiltTable}")
    log("parsed:\t${delegate?.parsed}")
    log("syntaxProvider:\t${delegate?.syntaxProvider}")
    log("useObjectsOnlyFrom:\t${delegate?.useObjectsOnlyFrom}")
    log("userDefinedSQL:\t${delegate?.userDefinedSQL}")
    log("validSQL:\t${delegate?.validSQL}")
    log("")
    log("associated:\t${delegate?.isAssociated()}")
    log("mtoNjoinCandidate:\t${delegate?.mtoNjoinCandidate}")
    log("referencedByFKs:\t${delegate?.referencedByFKs}")
    log("allFKColumns:\t${delegate?.getAllFKColumns()}")
    log("allFKPlaceHolderColumns:\t${delegate?.allFKPlaceHolderColumns}")
    log("allInds_PK_UK_NoFKeys:\t${delegate?.allInds_PK_UK_NoFKeys}")
    log("allNestedElements:\t${delegate?.allNestedElements}")
    log("allPossibleElements:\t${delegate?.allPossibleElements}")
    log("allSubstitutionTables:\t${delegate?.allSubstitutionTables}")
    log("allowedStrTypeInstances:\t${delegate?.allowedStrTypeInstances}")
    log("arcs:\t${delegate?.arcs}")
    log("byteSize:\tInsufficient documentation")
    log("checkConstraints:\t${delegate?.checkConstraints}")
    log("columnForDelegate:\tInsufficient documentation")
    log("columnGroupsSet:\t${delegate?.columnGroupsSet}")
    log("columnSet:\t${delegate?.columnSet}")
    log("deletedMapping:\t${delegate?.deletedMapping}")
    log("editableFonts:\t${delegate?.editableFonts}")
    log("engEntity:\t${delegate?.engEntity}")
    log("engRelation:\t${delegate?.engRelation}")
    log("expectedVolumes:\t${delegate?.expectedVolumes}")
    log("FKAssociations:\t${delegate?.FKAssociations}")
    log("FKAssociationsCount:\t${delegate?.FKAssociationsCount}")
    log("FKAssociationsList:\t${delegate?.FKAssociationsList}")
    log("FKIndexAssociationfor:\tInsufficient documentation")
    log("FKIndexAssociationsWith:\tInsufficient documentation")
    log("FKeysOnColumn:\tInsufficient documentation")
    log("fontObject:\t${delegate?.getFontObject()}")
    log("growthPercentInt:\t${delegate?.growthPercentInt}")
    log("indexByName:\t${delegate?.getIndexByName()}")
    log("indexes:\t${delegate?.indexes}")
    log("mappingsToEntities:\t${delegate?.mappingsToEntities}")
    log("maxVolumes:\t${delegate?.maxVolumes}")
    log("minVolumes:\t${delegate?.minVolumes}")
    log("nonStructuredElements:\t${delegate?.nonStructuredElements}")
    log("numberOfFKAssociationFor:\t${delegate?.getNumberOfFKAssociationFor()}")
    log("numberOfFKAssociationFor:\tInsufficient documentation")
    log("PKeys:\t${delegate?.PKeys}")
    log("possibleSplits:\t${delegate?.possibleSplits}")
    log("UKeys:\t${delegate?.UKeys}")
    log("validTimeDimAsString:\t${delegate?.validTimeDimAsString}")
    log("")
    log("columns:\t${delegate?.columns}")
    log("nestedElements:\t${delegate?.nestedElements}")
    log("indexes:\t${delegate?.indexes}")
    log("checkConstraints:\t${delegate?.checkConstraints}")
    log("validTimeDimensions:\t${delegate?.validTimeDimensions}")
    log("columnGroupsSet:\t${delegate?.columnGroupsSet}")
    log("spatialDefinitions:\t${delegate?.spatialDefinitions}")
    log("usedObjectsList:\t${delegate?.usedObjectsList}")

    log("\n")
    log("Class ContainerWithKeyObject")
    log("typeID:\t${typeID}")
    log("additionalClassificationTypes:\t${additionalClassificationTypes}")
    log("Read Only")
    log("valid:\t${valid}")
    log("firstFK:\t${firstFK}")
    log("keyArrayPrototype:\t${keyArrayPrototype}")
    log("keyGeneratedBy:\tInsufficient documentation")
    log("keyObject:\t${getKeyObject()}")
    log("keySet:\t${keySet}")
    log("keys:\t${keys}")
    log("keysWith:\t${getKeysWith()}")
    log("numberOfKeys:\t${numberOfKeys}")
    log("oidKey:\t${oidKey}")
    log("PKorUnique:\t${PKorUnique}")
    log("add_ClassificationTypes:\t${add_ClassificationTypes}")
    log("allClassificationTypes:\t${allClassificationTypes}")
    log("classificationType:\t${classificationType}")

    log("\n")
    log("Class ContainerObject")
    log("afterAlter:\t${afterAlter}")
    log("afterCreate:\t${afterCreate}")
    log("allowTypeSubstitution:\t${allowTypeSubstitution}")
    log("basedOnStructuredType:\t${basedOnStructuredType}")
    log("beforeAlter:\t${beforeAlter}")
    log("beforeCreate:\t${beforeCreate}")
    log("beforeDrop:\t${beforeDrop}")
    log("endOfScript:\t${endOfScript}")
    log("schemaObject:\t${schemaObject}")
    log("shouldGenerateScript:\t${shouldGenerateScript}")
    log("typeSubstitution:\t${typeSubstitution}")
    log("typeSubstitutionParentID:\t${typeSubstitutionParentID}")
    log("typeSubstitutionID:\t${typeSubstitutionID}")
    log("Read Only")
    log("BST:\t${BST}")
    log("partOfTypeSubstHierarchy:\t${partOfTypeSubstHierarchy}")
    log("root:\t${root}")
    log("substitutable:\t${substitutable}")
    log("allElementsGeneratedBy:\tInsufficient documentation")
    log("allElementsListGeneratedBy:\tInsufficient documentation")
    log("containedClass:\t${containedClass}")
    log("containedSet:\t${containedSet}")
    log("containerListeners:\t${containerListeners}")
    log("element:\tInsufficient documentation")
    log("elementByID:\tInsufficient documentation")
    log("elementByName:\tInsufficient documentation")
    log("elementByStructAttributeID:\tInsufficient documentation")
    log("elementGeneratedBy:\tInsufficient documentation")
    log("elements:\t${elements}")
    log("elementsByStructuredType:\tInsufficient documentation")
    log("elementsCollection:\t${elementsCollection}")
    log("elementsCollectionImmutable:\t${elementsCollectionImmutable}")
    log("indexOf:\tInsufficient documentation")
    log("localIDGenerator:\t${localIDGenerator}")
    log("localObject:\tInsufficient documentation")
    log("nestedElements:\t${nestedElements}")
    log("numberOfNullsAllowingElements:\t${numberOfNullsAllowingElements}")
    log("oidElement:\t${oidElement}")
    log("referIDMap:\t${referIDMap}")
    log("subTypeSubstitutions:\t${subTypeSubstitutions}")
    log("topLevelContainer:\t${topLevelContainer}")

    log("\n")
    log("Class MultiShapedDesignObject")
    log("alwaysVisibleInMainView:\t${alwaysVisibleInMainView}")
    log("visibleInMainview:\t${visibleInMainView}")
    log("affectedDPVs:\t${affectedDPVs}")
    log("allTopViews:\t${allTopViews}")
    log("allViews:\t${allViews}")
    log("allViewsWithCellViews:\t${allViewsWithCellViews}")
    log("anotherView:\tInsufficient documentation")
    log("viewSynonims:\t${getViewSynonims()}")
    log("usedInSubviews:\t${usedInSubviews}")

    log("\n")
    log("Class DesignObject")
    log("importedId:\t${importedId}")
    log("lineWidth:\t${lineWidth}")
    log("engineerTo:\t${engineerTo}")
    log("deprecated:\t${deprecated}")
    log("ORDSDropSchema:\t${ORDSDropSchema}")
    log("ORDSEnable:\t${ORDSEnable}")
    log("ORDSAuth:\t${ORDSAuth}")
    log("ORDSAlias:\t${ORDSAlias}")
    log("useDDLTransformationScript:\t${useDDLTransformationScript}")
    log("visible:\t${visible}")
    log("Read Only")
    log("containedObject:\t${containedObject}")
    log("designLevelAccessibleObject:\t${designLevelAccessibleObject}")
    log("designPartId:\t${designPartId}")
    log("firstViewForDPV:\t${getFirstViewForDPV()}")
    log("generatorLongName:\t${generatorLongName}")
    log("isBeingRemoved:\t${isBeingRemoved}")
    log("responsibleParties:\t${responsibleParties}")
    log("requests:\t${requests}")
    log("measurements:\t${measurements}")
    log("documents:\t${documents}")
    log("topViewsCount:\t${topViewsCount}")
    log("version:\t${version}")
    log("viewNumber:\tInsufficient documentation")
    log("viewsCountForDPV:\t${getViewsCountForDPV()}")
    log("viewsForDPv:\t${getViewsForDPV()}")
    log("Collections")
    log("fontObjectWrappers:\t${fontObjectWrappers}")
    log("measurements:\t${measurements}")
    log("documents:\t${documents}")
    log("requests:\t${requests}")
    log("responsibleParties:\t${responsibleParties}")

    log("\n")
    log("Class ModelIDObject")
    log("createdBy:\t${createdBy}")
    log("createdTime:\t${createdTime}")
    log("comment:\t${comment}")
    log("commentInRDBMS:\t${commentInRDBMS}")
    log("directorySegmentName:\t${directorySegmentName}")
    log("generatorID:\t${generatorID}")
    log("nameFixed:\t${nameFixed}")
    log("notes:\t${notes}")
    log("objectID:\t${objectID}")
    log("ownerDesignName:\t${ownerDesignName}")
    log("remoteDesignID:\t${remoteDesignID}")
    log("remoteModelID:\t${remoteModelID}")
    log("remoteObjectID:\t${remoteObjectID}")
    log("remoteObjectRelativeStorageName:\t${remoteObjectRelativeStorageName}")
    log("repositoryOID:\t${repositoryOID}")
    log("repositoryOVID:\t${repositoryOVID}")
    log("shouldEngineer:\t${shouldEngineer}")
    log("nameHasQuotes:\t${nameHasQuotes}")
    log("usedAsRemoteObject:\t${usedAsRemoteObject}")
    log("Read Only")
    log("dialogVisible:\t${dialogVisible}")
    log("systemObject:\t${systemObject}")
    log("change:\t${change}")
    log("changeTime:\t${changeTime}")
    log("creation:\t${creation}")
    log("creationTime:\t${creationTime}")
    log("generator:\t${generator}")
    log("IDPrefix:\t${IDPrefix}")
    log("maxNameLength:\t${maxNameLength}")
    log("objectTypeName:\t${getObjectTypeName()}")
    log("oldobjectTypeName:\t${oldObjectTypeName}")
    log("pathIDString:\t${pathIDString}")
    log("propertiesDialog:\t${propertiesDialog}")
    log("property:\tgetProperty('name_of_property')")
    log("propertyNames:\t${propertyNames}")
    log("markedGenerate:\t${markedGenerate}")

    log("\n")
    log("Class ModelObject")
    log("name:\t${name}")
    log("sourceConnName:\t${sourceConnName}")
    log("sourceObjSchema:\t${sourceObjSchema}")
    log("sourceObjName:\t${sourceObjName}")
    log("sourceDDLFile:\t${sourceDDLFile}")
    log("----------------------------------------------------------------------------")

  }

  /**
   * Returns all columns of a table.
   *
   * @return List of Column objects.
   */
  getColumns = {->
    return delegate.getElements()
  }

  /**
   * Returns the column of a table with the given name (case insensitive).
   *
   * @param matcher A String that is the name of the column
   * @return A Column object.
   */
  getColumnWhereNameEquals = {String matcher  ->
    cols = delegate.getElements()
    for (col in cols) {
      if (col.name.toUpperCase() == matcher.toUpperCase())
        return col
    }
    return null
  }

  /**
   * Returns a List of Column objects that match the given matcher (case insensitive).
   *
   * This method compares the column names with the matcher and returns those column
   * objects that match.
   *
   * The matcher is case insensitive and recognizes wildcards of '*' and '%' at the beginning or end and can take several forms.
   * A simple string: 'test'
   * A string contining a list of comma-seperated values: 'abc, 123, *test'
   * A Groovy List of strings: ['abc', '%123', 'test*']
   * @param matcher A String or List
   * @return List of Column objects.
   */
  getColumnsWhereNameLike = { matcher  ->
    return getThings(delegate.getElements(), matcher)
  }

  /**
   * Returns a List of Column objects that do not match the given matcher (case insensitive).
   *
   * This method compares the column names with the matcher and returns those column
   * objects that do not match.
   *
   * The matcher is case insensitive and recognizes wildcards of '*' and '%' at the beginning or end and can take several forms.
   * A simple string: 'test'
   * A string contining a list of comma-seperated values: 'abc, 123, *test'
   * A Groovy List of strings: ['abc', '%123', 'test*']
   *
   * @param matcher A String or List
   * @return List of Column objects.
   */
  getColumnsWhereNameNotLike= { matcher  ->
    return getThings(delegate.getElements(), matcher, true)
  }

  /**
   * Creates a column on the table using the provided information.
   *
   * This method adds a column to the table. Currently Numeric, Varchar and Date data types are supported.ß
   *
   * @param colName The name of the new column
   * @param datatype The data type of the new column
   * @param precisionOrSize The precision of a numeric column, or the size of a varchar. Use '' for date.
   * @param scaleOrType The scale of a numeric column, or the type, byte or char, for a varchar. Use '' for date.
   */
   addColumn = { colName, datatype, precisionOrSize, scaleOrType ->
    // if the datatype is not an allowed type, send a message to the log.
    def validTypes = model.design.logicalDatatypeSet.collect {it?.name.toUpperCase()}
    if (!validTypes.contains(datatype.toUpperCase())) {
      log ("Attempting to add column $colName to table ${delegate.name}: datatype $datatype not valid.  Must be one of: $validTypes")
    } else {

      def newCol = delegate.createColumn()
      newCol.with {
        name = colName
        use = 1
        logicalDatatype = model.design.logicalDatatypeSet.getLogTypeByName(datatype.toUpperCase());
        // if the column is a varchar, add the type to the size, othwise add it as a precision.
        switch (logicalDatatype.toString().toUpperCase()) {
          case 'STRING':
          case 'VARCHAR':
            dataTypeSize = "$precisionOrSize ${scaleOrType?.toUpperCase()}"
            break
          default:
            dataTypePrecision = precisionOrSize
            dataTypeScale = scaleOrType
        }
        ownDataTypeParameters = "${precisionOrSize},,"
      }
      delegate.dirty = true
    }
  }

  /**
   * Removes a column from the table based on the name
   *
   * This method drops a column from the table.
   *
   * @param colName The name of the column to be dropped
   */
  dropColumn = { colName ->
    // get column names for the table
    def columnNames = delegate.elements.collect {it.name.toUpperCase()}
    def dropColumn = colName.toUpperCase()
    if (columnNames.contains(dropColumn)) {
      def dropCol = getColumnWhereNameEquals(dropColumn)
      dropCol.remove()
      delegate.dirty = true
    }
  }

  /*
  addPrefix
  got ConcurrentModificationException
   it is not generally permissible for one thread to modify a Collection while another thread is iterating over it
  */

} // end of Table metaclass definition

oracle.dbtools.crest.model.design.relational.Column.metaClass {
  logProperties { ->
    log("\n")
    log("name:\t${name}")
    log("Class Column")
    log("abbreviation:\t${delegate?.abbreviation}")
    log("computed:\t${delegate?.computed}")
    log("containsPII:\t${delegate?.containsPII}")
    log("containsSensitiveInformation:\t${delegate?.containsSensitiveInformation}")
    log("defaultDisplayAs:\t${delegate?.defaultDisplayAs}")
    log("defaultDisplayedOnForms:\t${delegate?.defaultDisplayedOnForms}")
    log("defaultDisplayedOnReports:\t${delegate?.defaultDisplayedOnReports}")
    log("defaultFormDisplayWidth:\t${delegate?.defaultFormDisplayWidth}")
    log("defaultFormHeight:\t${delegate?.defaultFormHeight}")
    log("defaultFormMaximumWidth:\t${delegate?.defaultFormMaximumWidth}")
    log("defaultFormatMask:\t${delegate?.defaultFormatMask}")
    log("defaultHelpText:\t${delegate?.defaultHelpText}")
    log("defaultLabel:\t${delegate?.defaultLabel}")
    log("defaultReadOnly:\t${delegate?.defaultReadOnly}")
    log("maskData:\t${delegate?.maskData}")
    log("maskingType:\t${delegate?.maskingType}")
    log("maskTemplate:\t${delegate?.maskTemplate}")
    log("previousColumn:\t${delegate?.previousColumn}")
    log("autoIncrementColumn:\t${delegate?.autoIncrementColumn}")
    log("identityColumn:\t${delegate?.identityColumn}")
    log("autoIncrementGenerateAlways:\t${delegate?.autoIncrementGenerateAlways}")
    log("autoIncrementStartWith:\t${delegate?.autoIncrementStartWith}")
    log("autoIncrementIncrementBy:\t${delegate?.autoIncrementIncrementBy}")
    log("autoIncrementMinValue:\t${delegate?.autoIncrementMinValue}")
    log("autoIncrementMaxValue:\t${delegate?.autoIncrementMaxValue}")
    log("autoIncrementCycle:\t${delegate?.autoIncrementCycle}")
    log("autoIncrementDisableCache:\t${delegate?.autoIncrementDisableCache}")
    log("autoIncrementCache:\t${delegate?.autoIncrementCache}")
    log("autoIncrementOrder:\t${delegate?.autoIncrementOrder}")
    log("autoIncrementSequenceName:\t${delegate?.autoIncrementSequenceName}")
    log("autoIncrementTriggerName:\t${delegate?.autoIncrementTriggerName}")
    log("autoIncrementGenerateTrigger:\t${delegate?.autoIncrementGenerateTrigger}")
    log("notNullConstraintName:\t${delegate?.notNullConstraintName}")
    log("generateConstraintInDDL:\t${delegate?.generateConstraintInDDL}")
    log("discriminatorColumn:\t${delegate?.discriminatorColumn}")
    log("surrogateColumn:\t${delegate?.surrogateColumn}")
    log("relationshipColumn:\t${delegate?.relationshipColumn}")
    log("dependOnForeignKeyID:\t${delegate?.dependOnForeignKeyID}")
    log("dependOnFK_AsMandatory:\t${delegate?.dependOnFK_AsMandatory}")
    log("notNullConstraintNameFixed:\t${delegate?.notNullConstraintNameFixed}")
    log("checkConstraintNameFixed:\t${delegate?.checkConstraintNameFixed}")
    log("Read Only")
    log("adapter:\t${delegate?.adapter}")
    log("datatypeString:\t${delegate?.datatypeString}")
    log("dataTypeName:\t${delegate?.dataTypeName}")
    log("table:\t${delegate?.table}")
    log("tableSchemaName:\t${delegate?.tableSchemaName}")
    log("adapterLoaded:\t${delegate?.adapterLoaded}")
    log("FKColumn:\t${delegate?.FKColumn}")
    log("FKPlaceHolderColumn:\t${delegate?.FKPlaceHolderColumn}")
    log("inFKinArc:\t${delegate?.inFKinArc}")
    log("inOptionalFK:\t${delegate?.inOptionalFK}")
    log("partOfFKIndexAssociation:\tInsufficient documentation")
    log("referingTo:\tInsufficient documentation")
    log("AVTString:\t${delegate?.AVTString}")
    log("allDelegatesAndFK:\t${delegate?.allDelegatesAndFK}")
    log("allFKs:\t${delegate?.allFKs}")
    log("assocToColumn:\t${delegate?.getAssocToColumn()}")
    log("associationsCount:\t${delegate?.associationsCount}")
    log("datatypeText:\t${delegate?.datatypeText}")
    log("engAttribute:\t${delegate?.engAttribute}")
    log("FKAssociationsForDelegate:\t${delegate?.getFKAssociationsForDelegate()}")
    log("FKIndexAssociation:\t${delegate?.FKIndexAssociation}")
    log("mappingFor:\t${delegate?.getMappingFor()}")
    log("mappingsFor:\t${delegate?.getMappingsFor()}")
    log("optionalFK:\t${delegate?.optionalFK}")
    log("originatingColumn:\t${delegate?.originatingColumn}")
    log("refColAndAssocIDs:\t${delegate?.refColAndAssocIDs}")
    log("referencedColumn:\t${delegate?.referencedColumn}")
    log("Collections")
    log("FKAssociationMaps:\t${delegate?.FKAssociationMaps}")
    log("dependentColumns:\t${delegate?.dependentColumns}")
    log("\n")
    log("Class ContainedObjectWithDomain")
    log("allowSubtypeSubstitution:\t${delegate?.allowSubtypeSubstitution}")
    log("use:\t${delegate?.use}")
    log("collectionType:\t${delegate?.collectionType}")
    log("structuredType:\t${delegate?.structuredType}")
    log("distinctType:\t${delegate?.distinctType}")
    log("logicalDatatype:\t${delegate?.logicalDatatype}")
    log("dataTypePrecision:\t${delegate?.dataTypePrecision}")
    log("dataTypeScale:\t${delegate?.dataTypeScale}")
    log("dataTypeSize:\t${delegate?.dataTypeSize}")
    log("domain:\t${delegate?.domain}")
    log("reference:\t${delegate?.reference}")
    log("restrictedTypeSubstitution:\t${delegate?.restrictedTypeSubstitution}")
    log("usesDefaultValue:\t${delegate?.usesDefaultValue}")
    log("ownCheck:\t${delegate?.ownCheck}")
    log("ownValueList:\t${delegate?.ownValueList}")
    log("defaultValue:\t${delegate?.defaultValue}")
    log("sensitiveType:\t${delegate?.sensitiveType}")
    log("sensitiveTypeDescription:\t${delegate?.sensitiveTypeDescription}")
    log("ownDataTypeParameters:\t${delegate?.ownDataTypeParameters}")
    log("Read Only")
    log("dataTypeKind:\t${delegate?.dataTypeKind}")
    log("exactRefToStructuredType:\t${delegate?.isExactRefToStructuredType()}")
    log("PKElement:\t${delegate?.PKElement}")
    log("refToStructuredType:\t${delegate?.isRefToStructuredType()}")
    log("constraintsText:\t${delegate?.constraintsText}")
    log("containerWithKeyObject:\t${delegate?.containerWithKeyObject}")
    log("dataType:\t${delegate?.dataType}")
    log("dataTypeParameter:\tInsufficient documentation")
    log("datatypeString:\t${delegate?.datatypeString}")
    log("genericDatatypeString:\t${delegate?.genericDatatypeString}")
    log("permittedSubTypes:\t${delegate?.permittedSubTypes}")
    log("positionInPK:\t${delegate?.positionInPK}")
    log("precision:\t${delegate?.precision}")
    log("scale:\t${delegate?.scale}")
    log("units:\t${delegate?.units}")
    log("Collections")
    log("permittedStrTypes:\t${delegate?.getPermittedSubTypes()}")

    log("\n")
    log("Class ContainedObject")
    log("AVTSortOrder:\t${delegate?.AVTSortOrder}")
    log("collectionType:\t${delegate?.collectionType}")
    log("constraintComment:\t${delegate?.constraintComment}")
    log("constraintCommentInRDBMS:\t${delegate?.constraintCommentInRDBMS}")
    log("constraintName:\t${delegate?.constraintName}")
    log("constraintNotes:\t${delegate?.constraintNotes}")
    log("formulaDesc:\t${delegate?.formulaDesc}")
    log("nullsAllowed:\t${delegate?.nullsAllowed}")
    log("oid:\t${delegate?.oid}")
    log("parentObject:\t${delegate?.parentObject}")
    log("referedAttribute:\t${delegate?.referedAttribute}")
    log("scopeId:\t${delegate?.scopeId}")
    log("sourceType:\t${delegate?.sourceType}")
    log("structAttributeID:\t${delegate?.structAttributeID}")
    log("structuredType:\t${delegate?.structuredType}")
    log("synonym:\t${delegate?.synonym}")
    log("useDomainConstraints:\t${delegate?.useDomainConstraints}")
    log("Read Only")
    log("atomic:\t${delegate?.atomic}")
    log("mandatory:\t${delegate?.mandatory}")
    log("nested:\t${delegate?.nested}")
    log("FKElement:\t${delegate?.FKElement}")
    log("AVTs:\t${delegate?.AVTs}")
    log("delegateElement:\t${delegate?.delegateElement}")
    log("deletedMapping:\tInsufficient documentation")
    log("index:\t${delegate?.index}")
    log("nestedObjects:\t${delegate?.nestedObjects}")
    log("positionInContainerOneBased:\t${delegate?.positionInContainerOneBased}")
    log("scope:\t${delegate?.scope}")
    log("size:\t${delegate?.size}")
    log("Collections")
    log("listOfRanges:\t${delegate?.getAVTList()}")

    log("\n")
    log("Class DesignObject")
    log("importedId:\t${importedId}")
    log("lineWidth:\t${lineWidth}")
    log("engineerTo:\t${engineerTo}")
    log("deprecated:\t${deprecated}")
    log("ORDSDropSchema:\t${ORDSDropSchema}")
    log("ORDSEnable:\t${ORDSEnable}")
    log("ORDSAuth:\t${ORDSAuth}")
    log("ORDSAlias:\t${ORDSAlias}")
    log("useDDLTransformationScript:\t${useDDLTransformationScript}")
    log("visible:\t${visible}")
    log("Read Only")
    log("containedObject:\t${containedObject}")
    log("designLevelAccessibleObject:\t${designLevelAccessibleObject}")
    log("designPartId:\t${designPartId}")
    log("firstViewForDPV:\t${getFirstViewForDPV()}")
    log("generatorLongName:\t${generatorLongName}")
    log("isBeingRemoved:\t${isBeingRemoved}")
    log("responsibleParties:\t${responsibleParties}")
    log("requests:\t${requests}")
    log("measurements:\t${measurements}")
    log("documents:\t${documents}")
    log("topViewsCount:\t${topViewsCount}")
    log("version:\t${version}")
    log("viewNumber:\tInsufficient documentation")
    log("viewsCountForDPV:\t${getViewsCountForDPV()}")
    log("viewsForDPv:\t${getViewsForDPV()}")
    log("Collections")
    log("fontObjectWrappers:\t${fontObjectWrappers}")
    log("measurements:\t${measurements}")
    log("documents:\t${documents}")
    log("requests:\t${requests}")
    log("responsibleParties:\t${responsibleParties}")

    log("\n")
    log("Class ModelIDObject")
    log("createdBy:\t${createdBy}")
    log("createdTime:\t${createdTime}")
    log("comment:\t${comment}")
    log("commentInRDBMS:\t${commentInRDBMS}")
    log("directorySegmentName:\t${directorySegmentName}")
    log("generatorID:\t${generatorID}")
    log("nameFixed:\t${nameFixed}")
    log("notes:\t${notes}")
    log("objectID:\t${objectID}")
    log("ownerDesignName:\t${ownerDesignName}")
    log("remoteDesignID:\t${remoteDesignID}")
    log("remoteModelID:\t${remoteModelID}")
    log("remoteObjectID:\t${remoteObjectID}")
    log("remoteObjectRelativeStorageName:\t${remoteObjectRelativeStorageName}")
    log("repositoryOID:\t${repositoryOID}")
    log("repositoryOVID:\t${repositoryOVID}")
    log("shouldEngineer:\t${shouldEngineer}")
    log("nameHasQuotes:\t${nameHasQuotes}")
    log("usedAsRemoteObject:\t${usedAsRemoteObject}")
    log("Read Only")
    log("dialogVisible:\t${dialogVisible}")
    log("systemObject:\t${systemObject}")
    log("change:\t${change}")
    log("changeTime:\t${changeTime}")
    log("creation:\t${creation}")
    log("creationTime:\t${creationTime}")
    log("generator:\t${generator}")
    log("IDPrefix:\t${IDPrefix}")
    log("maxNameLength:\t${maxNameLength}")
    log("objectTypeName:\t${getObjectTypeName()}")
    log("oldobjectTypeName:\t${oldObjectTypeName}")
    log("pathIDString:\t${pathIDString}")
    log("propertiesDialog:\t${propertiesDialog}")
    log("property:\tgetProperty('name_of_property')")
    log("propertyNames:\t${propertyNames}")
    log("markedGenerate:\t${markedGenerate}")

    log("\n")
    log("Class ModelObject")
    log("name:\t${name}")
    log("sourceConnName:\t${sourceConnName}")
    log("sourceObjSchema:\t${sourceObjSchema}")
    log("sourceObjName:\t${sourceObjName}")
    log("sourceDDLFile:\t${sourceDDLFile}")
    log("----------------------------------------------------------------------------")

  }
}  // end of Column metaclass definition

 /**
  * Returns a list of the table objects found in the current relational model.
  *
  * @return List of Table objects.
  */
def getTables() {
  model.tableSet
}

  /**
   * Returns the table with the given name (case insensitive) found in the current relational model.
   *
   * @param matcher A String that is the name of the table
   * @return A Table object.
   */
def getTableWhereNameEquals(String matcher) {
  model.tableSet.getByName(matcher)
}

  /**
   * Returns a List of Table objects from the current relational model that match the given matcher (case insensitive).
   *
   * This method compares the table names with the matcher and returns those table
   * objects that match.
   *
   * The matcher is case insensitive and recognizes wildcards of '*' and '%' at the beginning or end and can take several forms.
   * A simple string: 'test'
   * A string contining a list of comma-seperated values: 'abc, 123, *test'
   * A Groovy List of strings: ['abc', '%123', 'test*']
   *
   * @param matcher A String or List
   * @return List of Table objects.
   */
def getTablesWhereNameLike(matcher) {
  getThings(model.tableSet, matcher)
}

  /**
   * Returns a List of Table objects from the current relational model that do not match the given matcher (case insensitive).
   *
   * This method compares the table names with the matcher and returns those table
   * objects that do not match.
   *
   * The matcher is case insensitive and recognizes wildcards of '*' and '%' at the beginning or end and can take several forms.
   * A simple string: 'test'
   * A string contining a list of comma-seperated values: 'abc, 123, *test'
   * A Groovy List of strings: ['abc', '%123', 'test*']
   *
   * @param matcher A String or List
   * @return List of Table objects.
   */
def getTablesWhereNameNotLike(matcher) {
  getThings(model.tableSet, matcher, true)
}



/*!
 * Private method to return objects from a list based on whether they match
 * or do not match a given string or list of strings
 *
 * @param thingList A List of objecs
 * @param includeMe A String or List
 * @param exclude A flag indicating if the returned values should include or exclude includeMe
 * @return List of objects.
*/
def getThings(thingList, includeMe='', Boolean exclude=false) {
  def retVal = []
  def withList = []

  if (includeMe) {
    thingList.each { thing ->
      if (exclude) {
        if (!stringContains (thing.name, includeMe)) {
          retVal << thing
        }
      } else {
        if (stringContains (thing.name, includeMe)) {
          retVal << thing
        }
      }
    }
   } else {  // if (includeMe)
     // return everything
     retVal = thingList
   }
   return retVal
}

/*!
 * Private method that returns true if the needle is found in the haystack, otherwise false.
 *
 * This method returns true if haystack contains any of the strings in the needleList.
 * Adding a '*' or '%' to the beginning or end
 * of the string will match "ends with" and "begins with" respectivly.
*/
Boolean stringContains (String haystack, needle) {

  Boolean retVal = false
  def wildCards = ['*', '%']
  def withList = []
  Integer  wildCardCount   // 1 = leading, 2 = ending, 3 = both

  // if the needle is a string, convert it to a list
  // if needle is a comma seperated string convert it to a list
  // if it is a list just use it
  if (needle.class.toString() == 'class java.util.ArrayList') {
    withList = needle
  } else {
    if (needle.contains(',')) {
      // break the comma seperated string into a list
      withList = needle.split(',')
    } else {  // single value put it in a list
      withList = [needle]
    }
  }

  withList.each { pin ->
    wildCardCount = 0
    if (wildCards.contains(pin[0]))
      wildCardCount += 1
    if (wildCards.contains(pin[-1]))
      wildCardCount += 2

    def haystackUpper = haystack?.toUpperCase()
    def pinUpper = pin.toUpperCase()
    switch (wildCardCount) {
      case 1:  // wild card in fist position
        retVal = retVal || haystackUpper.endsWith (pinUpper[1..-1]?.trim())
        break
      case 2:  // wild card in last position
        retVal = retVal || haystackUpper.startsWith (pinUpper[0..-2]?.trim())
        break
      case 3:  // double wildcard
        retVal = retVal || haystackUpper.contains ((pinUpper?.trim()) - wildCards[0]- wildCards[1])
        break
      default: //exact match
        retVal = retVal || haystackUpper == (pinUpper?.trim())
    }
  }
  return retVal
}

/*!
 * Writes to the log a string containing that command that was evaluated, and the result.
 *
 * Unfortunately it is not yet working in the context of sddm-plus.
 *
 * @param assertion String containg the command to be evaluated
 * @return String containing the command evaluated and the result
 */
def asserter(String assertion) {
	log("$assertion: ${evaluate(assertion)}")
}
