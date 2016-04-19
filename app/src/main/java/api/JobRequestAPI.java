package api;

import model.JobList;
import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Michal on 2016-04-19.
 */
public interface JobRequestAPI {

    @GET("/jobs")
    Call<JobList> loadJobs();

}
