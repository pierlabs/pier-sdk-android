package br.com.conductor.pier.api.v1_1.invoker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import br.com.conductor.pier.api.v1_1.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
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
    
    if ("AuthToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthToken>>(){}.getType();
    }
    
    if ("BodyAccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<BodyAccessToken>>(){}.getType();
    }
    
    if ("CancelarCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancelarCartaoResponse>>(){}.getType();
    }
    
    if ("Cartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<Cartao>>(){}.getType();
    }
    
    if ("CartaoResponseOld".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoResponseOld>>(){}.getType();
    }
    
    if ("ConsultarCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarCartaoResponse>>(){}.getType();
    }
    
    if ("ConsultarContaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarContaCartaoResponse>>(){}.getType();
    }
    
    if ("ConsultarContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarContaResponse>>(){}.getType();
    }
    
    if ("ConsultarExtratoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarExtratoContaResponse>>(){}.getType();
    }
    
    if ("ConsultarSaldoLimitesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarSaldoLimitesResponse>>(){}.getType();
    }
    
    if ("ContaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaCartaoResponse>>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaResponse>>(){}.getType();
    }
    
    if ("DesbloquearCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DesbloquearCartaoResponse>>(){}.getType();
    }
    
    if ("EmbossadoCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EmbossadoCartaoResponse>>(){}.getType();
    }
    
    if ("EstagioCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstagioCartao>>(){}.getType();
    }
    
    if ("ExtraInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtraInfo>>(){}.getType();
    }
    
    if ("ExtratoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtratoResponse>>(){}.getType();
    }
    
    if ("ListaCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListaCartoes>>(){}.getType();
    }
    
    if ("ListaOrigensComerciais".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListaOrigensComerciais>>(){}.getType();
    }
    
    if ("ListaProdutos".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListaProdutos>>(){}.getType();
    }
    
    if ("ListaStatusCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListaStatusCartoes>>(){}.getType();
    }
    
    if ("OrigemComercial".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrigemComercial>>(){}.getType();
    }
    
    if ("PageApiOfEstagioCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageApiOfEstagioCartao>>(){}.getType();
    }
    
    if ("PageEstagiosCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEstagiosCartoes>>(){}.getType();
    }
    
    if ("PessoaFisicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaFisicaResponse>>(){}.getType();
    }
    
    if ("Produto".equalsIgnoreCase(className)) {
      return new TypeToken<List<Produto>>(){}.getType();
    }
    
    if ("SaldoLimiteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SaldoLimiteResponse>>(){}.getType();
    }
    
    if ("StatusCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusCartao>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AuthToken".equalsIgnoreCase(className)) {
      return new TypeToken<AuthToken>(){}.getType();
    }
    
    if ("BodyAccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<BodyAccessToken>(){}.getType();
    }
    
    if ("CancelarCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CancelarCartaoResponse>(){}.getType();
    }
    
    if ("Cartao".equalsIgnoreCase(className)) {
      return new TypeToken<Cartao>(){}.getType();
    }
    
    if ("CartaoResponseOld".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoResponseOld>(){}.getType();
    }
    
    if ("ConsultarCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarCartaoResponse>(){}.getType();
    }
    
    if ("ConsultarContaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarContaCartaoResponse>(){}.getType();
    }
    
    if ("ConsultarContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarContaResponse>(){}.getType();
    }
    
    if ("ConsultarExtratoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarExtratoContaResponse>(){}.getType();
    }
    
    if ("ConsultarSaldoLimitesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarSaldoLimitesResponse>(){}.getType();
    }
    
    if ("ContaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaCartaoResponse>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaResponse>(){}.getType();
    }
    
    if ("DesbloquearCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DesbloquearCartaoResponse>(){}.getType();
    }
    
    if ("EmbossadoCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EmbossadoCartaoResponse>(){}.getType();
    }
    
    if ("EstagioCartao".equalsIgnoreCase(className)) {
      return new TypeToken<EstagioCartao>(){}.getType();
    }
    
    if ("ExtraInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ExtraInfo>(){}.getType();
    }
    
    if ("ExtratoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ExtratoResponse>(){}.getType();
    }
    
    if ("ListaCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<ListaCartoes>(){}.getType();
    }
    
    if ("ListaOrigensComerciais".equalsIgnoreCase(className)) {
      return new TypeToken<ListaOrigensComerciais>(){}.getType();
    }
    
    if ("ListaProdutos".equalsIgnoreCase(className)) {
      return new TypeToken<ListaProdutos>(){}.getType();
    }
    
    if ("ListaStatusCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<ListaStatusCartoes>(){}.getType();
    }
    
    if ("OrigemComercial".equalsIgnoreCase(className)) {
      return new TypeToken<OrigemComercial>(){}.getType();
    }
    
    if ("PageApiOfEstagioCartao".equalsIgnoreCase(className)) {
      return new TypeToken<PageApiOfEstagioCartao>(){}.getType();
    }
    
    if ("PageEstagiosCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<PageEstagiosCartoes>(){}.getType();
    }
    
    if ("PessoaFisicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaFisicaResponse>(){}.getType();
    }
    
    if ("Produto".equalsIgnoreCase(className)) {
      return new TypeToken<Produto>(){}.getType();
    }
    
    if ("SaldoLimiteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SaldoLimiteResponse>(){}.getType();
    }
    
    if ("StatusCartao".equalsIgnoreCase(className)) {
      return new TypeToken<StatusCartao>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
