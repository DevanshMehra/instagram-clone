package my.insta.bawanites.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=BJC2bYhNZnOe4Os3b-I7JLeYCPijXksiJ9VhToXBiUOkexGrX6rVGxyVXixd_YYRRN67FLjE6y82A1GG9fBuQNY"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
