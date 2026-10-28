package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/13_Buzz.feature")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.stepdefinitions, utility")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@logout")
public class LogoutTestRunner 
{

}