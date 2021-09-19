package com.example.remotecontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.AsyncRequestQueue;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void volumeDown(View view){
        //TODO abaixar o volume
        //define um tipo para a view (que é genérica) para facilitar a extração usando getText()
        sendCommand(((Button) view).getText().toString());
    }

    public void volumeUp(View view) {
        //@TODO aumentar o volume
        sendCommand(((Button) view).getText().toString());
    }

    public void sendCommand(String command) {

        try{
            //cria uma fila assincrona para enviar o comando de forma simples
            //usando volley que é uma biblioteca HTTP fácil e rapida
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            String URL = "http://192.168.25.2:8089/api/v1/command";

            JSONObject jsonObject = new JSONObject();
            try{
                jsonObject.put("command", command);
            }catch (JSONException e){
                e.printStackTrace();
            }

            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, URL, jsonObject, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    Log.i("Volley", response.toString());
                    System.out.println(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.i("Volley", error.toString());
                    error.printStackTrace();
                }
            });
            requestQueue.add(jsonObjectRequest);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}