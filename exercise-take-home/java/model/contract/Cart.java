import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class Cart<T> implements CartService{

    @Override
    public List<Cart> getAllCarts() {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpUriRequest request = RequestBuilder.get("https://dummyjson.com/carts").build();

        try {
            HttpResponse response = (HttpResponse) httpClient.execute(request);
            if (response.getStatusLine().getStatusCode() == 200) {
                // Parse the JSON response using Gson and extract the list of carts
                String jsonResponse = EntityUtils.toString(response.getEntity());
                Gson gson;
                List<Cart> carts = gson.fromJson(jsonResponse, new TypeToken<List<Cart>>() {}.getType());
                return carts;
            } else {
                // Handle other response codes if needed
                System.out.println("Error: " + response.getStatusLine().getStatusCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Object getCart(Integer cartId) {
        return null;
    }

    @Override
    public List<T> getUserCarts(Integer userId) {
        return null;
    }
}
