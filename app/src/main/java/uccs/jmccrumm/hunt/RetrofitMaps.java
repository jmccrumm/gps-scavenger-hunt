package uccs.jmccrumm.hunt;

import uccs.jmccrumm.hunt.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by John on 1/20/2017.
 */

public interface RetrofitMaps {
    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
     */
    @GET("api/directions/json?key=AIzaSyAbvnrJYU4smL2Tt2IsftLPmzn9ImKaZFg")
    Call<Example> getDistanceDuration(@Query("units") String units, @Query("origin") String origin, @Query("destination") String destination, @Query("mode") String mode);

}
