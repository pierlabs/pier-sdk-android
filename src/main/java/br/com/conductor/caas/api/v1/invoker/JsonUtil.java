package br.com.conductor.caas.api.v1.invoker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import br.com.conductor.caas.api.v1.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoResponse>>(){}.getType();
    }
    
    if ("DesbloquearCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DesbloquearCartaoResponse>>(){}.getType();
    }
    
    if ("ConsultarExtratoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarExtratoContaResponse>>(){}.getType();
    }
    
    if ("PessoaFisicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaFisicaResponse>>(){}.getType();
    }
    
    if ("ConsultarSaldoLimitesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarSaldoLimitesResponse>>(){}.getType();
    }
    
    if ("ConsultarCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarCartaoResponse>>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaResponse>>(){}.getType();
    }
    
    if ("ExtratoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtratoResponse>>(){}.getType();
    }
    
    if ("CancelarCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancelarCartaoResponse>>(){}.getType();
    }
    
    if ("SaldoLimiteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaldoLimiteResponse>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("CartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoResponse>(){}.getType();
    }
    
    if ("DesbloquearCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DesbloquearCartaoResponse>(){}.getType();
    }
    
    if ("ConsultarExtratoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarExtratoContaResponse>(){}.getType();
    }
    
    if ("PessoaFisicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaFisicaResponse>(){}.getType();
    }
    
    if ("ConsultarSaldoLimitesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarSaldoLimitesResponse>(){}.getType();
    }
    
    if ("ConsultarCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarCartaoResponse>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaResponse>(){}.getType();
    }
    
    if ("ExtratoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ExtratoResponse>(){}.getType();
    }
    
    if ("CancelarCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CancelarCartaoResponse>(){}.getType();
    }
    
    if ("SaldoLimiteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SaldoLimiteResponse>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
