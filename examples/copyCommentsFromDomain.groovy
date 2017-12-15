/**
 * This method copies comments from a domain object to the Comment and "Comment in RDBMS"
 * properties of columns defined using that domain.
 *
 * The underlying reason for this method is further described here:
 * https://daveschleis.wordpress.com/2017/07/27/from-domain-to-database-a-comment-conundrum/
 *
 * These methods rely on the SDDM^Plus scripting library, which must be included when using this file.
 * for example, in the Custom Transformation Script window of SDDM you would enter:
 @example
// parse the local copy of the sddm-plus file into a string variable
def sddmPlus = new File('/Users/local/git/sddm-plus/source/sddm-plus.groovy').text

//def scrAudit = new File('/Users/local/git/sddm-plus/examples/auditColumns.groovy').text

def scrDomain = new File('/Users/local/git/sddm-plus/examples/copyCommentsFromDomain.groovy').text

// parse the script that calls the other methods into a string variable
def scrWork = new File('/Users/local/sddm-plus/scripts/copyDomCom.groovy').text

// Use the Groovy evaluate method on the concatenated strings
evaluate (sddmPlus+scrDomain+scrWork)
 */
def copyDomainCommentToColumns () {
  tables.each { table ->
    table.columns.each { column ->
      copyDomainComments(column)
    }
  }
}

def copyDomainComments (object) {
  def maxLength = 4000

  // if there are no comments in RDBMS for the object
  if (!object.commentInRDBMS) {
    // see if the object has a defined domain
    if (object.domain != 'Unknown') {
    	// grab the domain comment
    	def domainCmt = object.domain.comment
    	// if there is a domain comment
      if (domainCmt){
    	  // copy to comment and comment in RDBMS
          if (domainCmt.size() > maxLength)
            domainCmt = domainCmt.substring(0, maxLength)
          object.comment = object.commentInRDBMS = domainCmt
        object.setDirty(true);
      }
    }
  }
}
