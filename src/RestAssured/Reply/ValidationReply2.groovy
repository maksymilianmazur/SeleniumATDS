package Reply

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







