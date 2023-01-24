package Reply

import org.junit.Test

def holder = new com.eviware()

// String referenceDocumentBusinessIdentificator = holder["//*:referenceDocumentBusinessIdentificator"]
//String replyCode = holder["//*:ReplyCode"]
//String replyDescription= holder["//*:replyDescription"]
String referenceDocumentBusinessIdentificator = "03001-002";
String replyCode = "OK";
String replyDescription="testowy kod błędu";
class ValidationReply2 {
    private String referenceDocumentBusinessIdentificator;
    private String replyCode;
    private String expectedReplyCode;
    private String replyDescription

    void assertReplyCode()
    {
        if (this.replyCode == this.expectedReplyCode)
        {
            System.out.println("Test passed: EOP-PT-PU-"+referenceDocumentBusinessIdentificator+"-AT")
        }
        else{
            System.out.println("Test failed: EOP-PT-PU-"+referenceDocumentBusinessIdentificator+"-AT")
        }
    }
    protected ValidationReply2 assertReplyCode2()
    {
        if (this.replyCode == this.expectedReplyCode)
        {
            System.out.println("Test passed: EOP-PT-PU-" + referenceDocumentBusinessIdentificator + "-AT")
        }
        else
        {
            System.out.println("Test failed: EOP-PT-PU-" + referenceDocumentBusinessIdentificator + "-AT")
        }
        return this;
    }
    ValidationReply2(String referenceDocumentBusinessIdentificator, String replyCode, String expectedReplyCode)
    {
        this.referenceDocumentBusinessIdentificator = referenceDocumentBusinessIdentificator
        this.replyCode = replyCode
        this.expectedReplyCode = expectedReplyCode
    }

    ValidationReply2(String referenceDocumentBusinessIdentificator, String replyCode, String expectedReplyCode, String replyDescription)
    {
        this(referenceDocumentBusinessIdentificator, replyCode,expectedReplyCode); // extended constructor
        this.replyDescription = replyDescription
    }

}




switch(referenceDocumentBusinessIdentificator)
{
    case "03001-001":
        ValidationReply2 validationObject = new ValidationReply2(referenceDocumentBusinessIdentificator,replyCode,"OK")
        validationObject.assertReplyCode()

    case "03001-002":
        ValidationReply2 validationObject = new ValidationReply2(referenceDocumentBusinessIdentificator,replyCode,"OK",replyDescription)
        validationObject.assertReplyCode2().assertReplyCode()
}

