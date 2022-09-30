package org.sunbird.common.util;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.springframework.http.HttpStatus;
import org.sunbird.common.exceptions.ProjectCommonException;
import org.sunbird.common.exceptions.ResponseCode;
import org.sunbird.common.model.SBApiResponse;
import org.sunbird.common.model.SunbirdApiRespParam;
import org.sunbird.core.logger.CbExtLogger;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class will contains all the common utility methods.
 *
 * @author Manzarul
 */
public class ProjectUtil {

    public static final CbExtLogger logger = new CbExtLogger(ProjectUtil.class.getName());

    public static final PropertiesCache propertiesCache;

    static {
        propertiesCache = PropertiesCache.getInstance();
    }

    public static String getConfigValue(String key) {
        if (StringUtils.isNotBlank(System.getenv(key))) {
            return System.getenv(key);
        }
        return propertiesCache.readProperty(key);
    }

    /**
     * This method will check incoming value is null or empty it will do empty check by doing trim
     * method. in case of null or empty it will return true else false.
     *
     * @param value
     * @return
     */
    public static boolean isStringNullOREmpty(String value) {
        return (value == null || "".equals(value.trim()));
    }

    /**
     * This method will create and return server exception to caller.
     *
     * @param responseCode ResponseCode
     * @return ProjectCommonException
     */
    public static ProjectCommonException createServerError(ResponseCode responseCode) {
        return new ProjectCommonException(
                responseCode.getErrorCode(),
                responseCode.getErrorMessage(),
                ResponseCode.SERVER_ERROR.getResponseCode());
    }

    public static ProjectCommonException createClientException(ResponseCode responseCode) {
        return new ProjectCommonException(
                responseCode.getErrorCode(),
                responseCode.getErrorMessage(),
                ResponseCode.CLIENT_ERROR.getResponseCode());
    }
    
    public static SBApiResponse createDefaultResponse(String api) {
		SBApiResponse response = new SBApiResponse();
		response.setId(api);
		response.setVer(Constants.API_VERSION_1);
		response.setParams(new SunbirdApiRespParam());
		response.getParams().setStatus(Constants.SUCCESS);
		response.setResponseCode(HttpStatus.OK);
		response.setTs(DateTime.now().toString());
		return response;
	}


    public enum Method {
        GET,
        POST,
        PUT,
        DELETE,
        PATCH
    }

    public static String convertSecondsToHrsAndMins(int seconds) {
        String time = "";
        if (seconds > 60) {
            int min = (seconds / 60) % 60;
            int hours = (seconds / 60) / 60;
            String strmin = (min < 10) ? "0" + min : Integer.toString(min);
            String strHours = (hours < 10) ? "0" + hours : Integer.toString(hours);
            if (min > 0 && hours > 0)
                time = strHours + "h " + strmin + "m";
            else if (min <= 0 && hours > 0)
                time = strHours + "h";
            else if (min > 0 && hours <= 0) {
                time = strmin + "m";
            }
        }
        return time;
    }

    public static String firstLetterCapitalWithSingleSpace(final String words) {
        return Stream.of(words.trim().split("\\s"))
                .filter(word -> word.length() > 0)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }

}