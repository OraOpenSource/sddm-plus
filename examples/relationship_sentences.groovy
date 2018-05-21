entities.each { ent ->
  ent.relations.each { rel ->
    log (buildRelationString(ent.name, rel))
  }
}

def buildRelationString (entity, rel) {
  def retVal
  if (entity == rel.sourceEntity.name) {  // if this is the SOURCE entity
    retVal = "${optionalityString (rel.sourceEntity.name, rel.isOptionalSource(), rel.nameOnSource, 'have') }"
    retVal += " ${cardinalityString(rel.targetCardinalityString,rel.targetEntity.name)}\n"
  } else {  // if this is the TARGET entity
    retVal = "${optionalityString (rel.targetEntity.name, rel.isOptionalTarget(), rel.nameOnTarget, 'belong to') }"
    retVal += " ${cardinalityString(rel.sourceCardinalityString,rel.sourceEntity.name)}"
  }
  return retVal
}

def optionalityString (entity, isOptional, descriptor, defaultDescriptor) {
  "   Each $entity ${isOptional?'may':'must be'} ${descriptor?:defaultDescriptor}"
}

def cardinalityString (cardinality, entity) {
  "${cardinality=='1'?'one and only one':'one or more'} ${pluralizeIt (cardinality, entity)}"
}

def pluralizeIt (cardinality, entity) {
  def retVal = entity
  if (cardinality == '*') {
    if (['h','o','s','x','z'].contains(retVal[-1])) {
      retVal += 'es'
    } else {
      retVal += 's'
    }
  }
  return retVal
}
