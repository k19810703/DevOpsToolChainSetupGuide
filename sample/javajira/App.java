package WHD.Test;

import java.io.File;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //连接jira
    	BasicCredentials creds = new BasicCredentials("{username}", "{password}");
        JiraClient jira = new JiraClient("http://{jiraurl}:{jiraport}", creds);
        
        Issue issue;
		try {
		    //取得issue
			issue = jira.getIssue("{IssueID 比如FP-1}");
			//添加comment
            issue.addComment("test comment");
	        /* Print the issue key. */
	        System.out.println(issue);

	        /* You can also do it like this: */
	        System.out.println(issue.getKey());
	        
            /*提交新的{issue type}的issue到项目{roject key}*/
            Issue newIssue = jira.createIssue("{project key}", "{issue type}")
                .field(Field.SUMMARY, "JAVA API TEST")
                .field(Field.DESCRIPTION, "XXXXXXXXXXXXX")
                .execute();
            //上传文件到ticket
            File file = new File("{yourfile}");
            newIssue.addAttachment(file);
            System.out.println(newIssue);

		} catch (JiraException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

    }
}
