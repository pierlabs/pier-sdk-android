package br.com.conductor.pier.api.v2.invoker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import br.com.conductor.pier.api.v2.model.*;

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
    
    if ("Cartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<Cartao>>(){}.getType();
    }
    
    if ("CartaoImpressao".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoImpressao>>(){}.getType();
    }
    
    if ("Conta".equalsIgnoreCase(className)) {
      return new TypeToken<List<Conta>>(){}.getType();
    }
    
    if ("Endereco".equalsIgnoreCase(className)) {
      return new TypeToken<List<Endereco>>(){}.getType();
    }
    
    if ("EstagioCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstagioCartao>>(){}.getType();
    }
    
    if ("ExtraInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtraInfo>>(){}.getType();
    }
    
    if ("HistoricoImpressaoCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoImpressaoCartao>>(){}.getType();
    }
    
    if ("LimiteDisponibilidade".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimiteDisponibilidade>>(){}.getType();
    }
    
    if ("ListaProdutos".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListaProdutos>>(){}.getType();
    }
    
    if ("OrigemComercial".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrigemComercial>>(){}.getType();
    }
    
    if ("PageCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCartoes>>(){}.getType();
    }
    
    if ("PageEnderecos".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEnderecos>>(){}.getType();
    }
    
    if ("PageEstagiosCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEstagiosCartoes>>(){}.getType();
    }
    
    if ("PageOrigensComerciais".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOrigensComerciais>>(){}.getType();
    }
    
    if ("PagePessoas".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePessoas>>(){}.getType();
    }
    
    if ("PagePortador".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePortador>>(){}.getType();
    }
    
    if ("PageStatusCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusCartoes>>(){}.getType();
    }
    
    if ("PageStatusContas".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusContas>>(){}.getType();
    }
    
    if ("PageStatusImpressao".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusImpressao>>(){}.getType();
    }
    
    if ("PageTelefones".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTelefones>>(){}.getType();
    }
    
    if ("PageTipoTelefones".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoTelefones>>(){}.getType();
    }
    
    if ("PageTiposEndereco".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTiposEndereco>>(){}.getType();
    }
    
    if ("PageWebHooks".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageWebHooks>>(){}.getType();
    }
    
    if ("Pessoa".equalsIgnoreCase(className)) {
      return new TypeToken<List<Pessoa>>(){}.getType();
    }
    
    if ("Portador".equalsIgnoreCase(className)) {
      return new TypeToken<List<Portador>>(){}.getType();
    }
    
    if ("Produto".equalsIgnoreCase(className)) {
      return new TypeToken<List<Produto>>(){}.getType();
    }
    
    if ("StatusCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusCartao>>(){}.getType();
    }
    
    if ("StatusConta".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusConta>>(){}.getType();
    }
    
    if ("StatusImpressao".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusImpressao>>(){}.getType();
    }
    
    if ("Telefone".equalsIgnoreCase(className)) {
      return new TypeToken<List<Telefone>>(){}.getType();
    }
    
    if ("TipoEndereco".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoEndereco>>(){}.getType();
    }
    
    if ("TipoTelefone".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTelefone>>(){}.getType();
    }
    
    if ("WebHook".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebHook>>(){}.getType();
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
    
    if ("Cartao".equalsIgnoreCase(className)) {
      return new TypeToken<Cartao>(){}.getType();
    }
    
    if ("CartaoImpressao".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoImpressao>(){}.getType();
    }
    
    if ("Conta".equalsIgnoreCase(className)) {
      return new TypeToken<Conta>(){}.getType();
    }
    
    if ("Endereco".equalsIgnoreCase(className)) {
      return new TypeToken<Endereco>(){}.getType();
    }
    
    if ("EstagioCartao".equalsIgnoreCase(className)) {
      return new TypeToken<EstagioCartao>(){}.getType();
    }
    
    if ("ExtraInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ExtraInfo>(){}.getType();
    }
    
    if ("HistoricoImpressaoCartao".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoImpressaoCartao>(){}.getType();
    }
    
    if ("LimiteDisponibilidade".equalsIgnoreCase(className)) {
      return new TypeToken<LimiteDisponibilidade>(){}.getType();
    }
    
    if ("ListaProdutos".equalsIgnoreCase(className)) {
      return new TypeToken<ListaProdutos>(){}.getType();
    }
    
    if ("OrigemComercial".equalsIgnoreCase(className)) {
      return new TypeToken<OrigemComercial>(){}.getType();
    }
    
    if ("PageCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<PageCartoes>(){}.getType();
    }
    
    if ("PageEnderecos".equalsIgnoreCase(className)) {
      return new TypeToken<PageEnderecos>(){}.getType();
    }
    
    if ("PageEstagiosCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<PageEstagiosCartoes>(){}.getType();
    }
    
    if ("PageOrigensComerciais".equalsIgnoreCase(className)) {
      return new TypeToken<PageOrigensComerciais>(){}.getType();
    }
    
    if ("PagePessoas".equalsIgnoreCase(className)) {
      return new TypeToken<PagePessoas>(){}.getType();
    }
    
    if ("PagePortador".equalsIgnoreCase(className)) {
      return new TypeToken<PagePortador>(){}.getType();
    }
    
    if ("PageStatusCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusCartoes>(){}.getType();
    }
    
    if ("PageStatusContas".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusContas>(){}.getType();
    }
    
    if ("PageStatusImpressao".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusImpressao>(){}.getType();
    }
    
    if ("PageTelefones".equalsIgnoreCase(className)) {
      return new TypeToken<PageTelefones>(){}.getType();
    }
    
    if ("PageTipoTelefones".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoTelefones>(){}.getType();
    }
    
    if ("PageTiposEndereco".equalsIgnoreCase(className)) {
      return new TypeToken<PageTiposEndereco>(){}.getType();
    }
    
    if ("PageWebHooks".equalsIgnoreCase(className)) {
      return new TypeToken<PageWebHooks>(){}.getType();
    }
    
    if ("Pessoa".equalsIgnoreCase(className)) {
      return new TypeToken<Pessoa>(){}.getType();
    }
    
    if ("Portador".equalsIgnoreCase(className)) {
      return new TypeToken<Portador>(){}.getType();
    }
    
    if ("Produto".equalsIgnoreCase(className)) {
      return new TypeToken<Produto>(){}.getType();
    }
    
    if ("StatusCartao".equalsIgnoreCase(className)) {
      return new TypeToken<StatusCartao>(){}.getType();
    }
    
    if ("StatusConta".equalsIgnoreCase(className)) {
      return new TypeToken<StatusConta>(){}.getType();
    }
    
    if ("StatusImpressao".equalsIgnoreCase(className)) {
      return new TypeToken<StatusImpressao>(){}.getType();
    }
    
    if ("Telefone".equalsIgnoreCase(className)) {
      return new TypeToken<Telefone>(){}.getType();
    }
    
    if ("TipoEndereco".equalsIgnoreCase(className)) {
      return new TypeToken<TipoEndereco>(){}.getType();
    }
    
    if ("TipoTelefone".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTelefone>(){}.getType();
    }
    
    if ("WebHook".equalsIgnoreCase(className)) {
      return new TypeToken<WebHook>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
