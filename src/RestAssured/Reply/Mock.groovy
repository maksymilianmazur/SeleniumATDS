package Reply
def holder = new com.eviware()

  // String referenceDocumentBusinessIdentificator = holder["//*:referenceDocumentBusinessIdentificator"]
   //String replyCode = holder["//*:ReplyCode"]
   //String replyDescription= holder["//*:replyDescription"]

     String referenceDocumentBusinessIdentificator = "03001-002";
     String replyCode = "OK";
     String replyDescription="testowy kod błędu";
    switch(referenceDocumentBusinessIdentificator)
    {
        case "03001-001":
            ValidationReply2 validationObject = new ValidationReply2(referenceDocumentBusinessIdentificator,replyCode,"OK")
            validationObject.assertReplyCode()

        case "03001-002":
            ValidationReply2 validationObject = new ValidationReply2(referenceDocumentBusinessIdentificator,replyCode,"OK",replyDescription)
            validationObject.assertReplyCode2().assertReplyCode()
    }

