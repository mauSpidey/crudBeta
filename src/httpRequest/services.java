/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpRequest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import jsonBean.array;
import jsonBean.beanArrays;
import jsonBean.curso;
import jsonBean.cursos;
import jsonBean.datos;
import jsonBean.fecha;
import jsonBean.registroCollection;
import jsonBean.sesionInfo;
import jsonBean.sesiones;

/**
 *
 * @author HP
 */
public class services {
    
        public Collection getCursos(String key,String value,String urlArg){
        
        
            Collection<cursos> enums = null;
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key, value);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                String json="";
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                in.close();

                Gson jsonEncode=new Gson();
                /*
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    */
                Type collectionType = new TypeToken<Collection<cursos>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));



            } catch (IOException e) {
            }

            return enums;
        }
        public Collection getInfoSesiones(String key,String value,String urlArg){
        
        
            Collection<sesionInfo> enums = null;
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key, value);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                String json="";
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                in.close();

                Gson jsonEncode=new Gson();
                /*
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    */
                Type collectionType = new TypeToken<Collection<sesionInfo>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));



            } catch (IOException e) {
            }

            return enums;
        }
        public Collection getSesiones(String key,String value,String key2,String value2,String urlArg){
        
        
            Collection<sesiones> enums = null;
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key, value);
                parama.put(key2, value2);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                String json="";
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                in.close();

                Gson jsonEncode=new Gson();
                /*
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    */
                Type collectionType = new TypeToken<Collection<sesiones>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));



            } catch (IOException e) {
            }

            return enums;
        }
        public Collection getFecha(String key,String value,String key2,String value2,String urlArg){
        
        
            Collection<fecha> enums = null;
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key, value);
                parama.put(key2, value2);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                String json="";
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                in.close();

                Gson jsonEncode=new Gson();
                /*
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    */
                Type collectionType = new TypeToken<Collection<fecha>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));



            } catch (IOException e) {
            }

            return enums;
        }
        public Collection getRegistro(String key,String value,String urlArg){
        
        
            Collection<registroCollection> enums = null;
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key, value);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                String json="";
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                in.close();

                Gson jsonEncode=new Gson();
                /*
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    */
                Type collectionType = new TypeToken<Collection<registroCollection>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));



            } catch (IOException e) {
            }

            return enums;
        }
        public String truncateSesion(String key,String value,String key2,String value2,String urlArg){
        
        
            //Collection<fecha> enums = null;
            String json="";
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key, value);
                parama.put(key2, value2);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                in.close();

                //Gson jsonEncode=new Gson();
                /*
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    */
                //Type collectionType = new TypeToken<Collection<fecha>>(){}.getType();
                //enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));



            } catch (IOException e) {
                json="Ocurrio un error. Comprueba tu Conexion";
            }

            return json;
        }
        public String updateFecha(String key,String value,String key2,String value2,String key3,String value3,String urlArg){
        
            //String json="";
            String json="";
            //Collection<fecha> enums = null;
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key, value);
                parama.put(key2, value2);
                parama.put(key3,value3);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                in.close();

                //Gson jsonEncode=new Gson();
                /*
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    */
                //Type collectionType = new TypeToken<Collection<fecha>>(){}.getType();
                //enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));



            } catch (IOException e) {
                json="Ocurrio un error. Comprueba tu conexion";
            }

            return json;
        }
        public Collection getAll(String key,String value,String urlArg){
        
        
            Collection<array> enums = null;
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key, value);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                String json="";
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                in.close();

                Gson jsonEncode=new Gson();
                /*
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    */
                Type collectionType = new TypeToken<Collection<beanArrays>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));



            } catch (IOException e) {
                System.out.println("ERROR IO");
            }catch(Exception i){
                System.out.println("ERROR G");
            }

            return enums;
        }
        public String getDatos(String key1,String value1,String key2,String value2,String key3,String value3,String key4,String value4,String key5,String value5,String urlArg){
        
        
            //Collection<datos> enums = null;
            String json="";
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key1, value1);
                parama.put(key2, value2);
                parama.put(key3, value3);
                parama.put(key4, value4);
                parama.put(key5, value5);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                System.out.println(json);
                in.close();
                /*
                Gson jsonEncode=new Gson();
                
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    
                Type collectionType = new TypeToken<Collection<datos>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));
                */


            } catch (IOException e) {
                json="No ha pasado nada. Comprueba tu conexion";
            }

            return json;
        }
        public String deleteSesion(String key1,String value1,String urlArg){
        
        
            //Collection<datos> enums = null;
            String json="";
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key1, value1);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                System.out.println(json);
                in.close();
                /*
                Gson jsonEncode=new Gson();
                
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    
                Type collectionType = new TypeToken<Collection<datos>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));
                */


            } catch (IOException e) {
                json="No ha pasado nada. Comprueba tu conexion";
            }

            return json;
        }
        public String setUser(String key1,String value1,String key2,String value2,String key3,String value3,String key4,String value4,String key5,String value5,String key6,String value6,String urlArg){
        
        
            //Collection<datos> enums = null;
            String json="";
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key1, value1);
                parama.put(key2, value2);
                parama.put(key3, value3);
                parama.put(key4, value4);
                parama.put(key5, value5);
                parama.put(key6, value6);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                System.out.println(json);
                in.close();
                /*
                Gson jsonEncode=new Gson();
                
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    
                Type collectionType = new TypeToken<Collection<datos>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));
                */


            } catch (IOException e) {
                json="No ha pasado nada. Comprueba tu conexion";
            }

            return json;
        }
        public String updateUser(String key1,String value1,String key2,String value2,String key3,String value3,String key4,String value4,String key5,String value5,String key6,String value6,String key7,String value7,String urlArg){
        
        
            //Collection<datos> enums = null;
            String json="";
            try {
                URL url=new URL(urlArg);
                Map<String,Object> parama=new LinkedHashMap<>();
                parama.put(key1, value1);
                parama.put(key2, value2);
                parama.put(key3, value3);
                parama.put(key4, value4);
                parama.put(key5, value5);
                parama.put(key6, value6);
                parama.put(key7, value7);

                StringBuilder postData=new StringBuilder();

                for (Map.Entry<String, Object> param:parama.entrySet()){
                    if(postData.length()!=0){
                        postData.append("&");
                    }
                    postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                    postData.append("=");
                    postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

                }
                byte[] postBytes=postData.toString().getBytes("UTF-8");
                HttpURLConnection con=(HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                con.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                con.setDoOutput(true);
                con.getOutputStream().write(postBytes);

                Reader in=new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
                
                for(int c = in.read();c!=-1;c=in.read()){
                    //System.out.print((char)c);
                    json=json+(char)c;

                }
                System.out.println(json);
                in.close();
                /*
                Gson jsonEncode=new Gson();
                
                jsonBean curso=jsonEncode.fromJson(json, jsonBean.class);
                System.out.println(curso);
    
                Type collectionType = new TypeToken<Collection<datos>>(){}.getType();
                enums = jsonEncode.fromJson(json, collectionType);
                //enums.forEach((n) -> System.out.println(n.getCurso()));
                */


            } catch (IOException e) {
                json="No ha pasado nada. Comprueba tu conexion";
            }

            return json;
        }
        
}
