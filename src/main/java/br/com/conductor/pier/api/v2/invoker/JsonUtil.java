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
    
    if ("AtendimentoCliente".equalsIgnoreCase(className)) {
      return new TypeToken<List<AtendimentoCliente>>(){}.getType();
    }
    
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
    
    if ("FaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaResponse>>(){}.getType();
    }
    
    if ("HistoricoImpressaoCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoImpressaoCartao>>(){}.getType();
    }
    
    if ("HistoricoTelefone".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoTelefone>>(){}.getType();
    }
    
    if ("LimiteDisponibilidade".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimiteDisponibilidade>>(){}.getType();
    }
    
    if ("ListaProdutos".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListaProdutos>>(){}.getType();
    }
    
    if ("LoteCartoesPrePagos".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoteCartoesPrePagos>>(){}.getType();
    }
    
    if ("NotificacaoPushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoPushResponse>>(){}.getType();
    }
    
    if ("NotificacaoSMSBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoSMSBody>>(){}.getType();
    }
    
    if ("NotificacaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoSMSResponse>>(){}.getType();
    }
    
    if ("OrigemComercial".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrigemComercial>>(){}.getType();
    }
    
    if ("PageAtendimentoClientes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAtendimentoClientes>>(){}.getType();
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
    
    if ("PageFaturas".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturas>>(){}.getType();
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
    
    if ("PagePush".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePush>>(){}.getType();
    }
    
    if ("PageSMS".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSMS>>(){}.getType();
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
    
    if ("PageTransacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacaoResponse>>(){}.getType();
    }
    
    if ("PageTransferencias".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransferencias>>(){}.getType();
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
    
    if ("PushAPNS".equalsIgnoreCase(className)) {
      return new TypeToken<List<PushAPNS>>(){}.getType();
    }
    
    if ("PushFCMEGCM".equalsIgnoreCase(className)) {
      return new TypeToken<List<PushFCMEGCM>>(){}.getType();
    }
    
    if ("SMS".equalsIgnoreCase(className)) {
      return new TypeToken<List<SMS>>(){}.getType();
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
    
    if ("TransacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoResponse>>(){}.getType();
    }
    
    if ("Transferencia".equalsIgnoreCase(className)) {
      return new TypeToken<List<Transferencia>>(){}.getType();
    }
    
    if ("ValidaCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidaCartao>>(){}.getType();
    }
    
    if ("WebHook".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebHook>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AtendimentoCliente".equalsIgnoreCase(className)) {
      return new TypeToken<AtendimentoCliente>(){}.getType();
    }
    
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
    
    if ("FaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaResponse>(){}.getType();
    }
    
    if ("HistoricoImpressaoCartao".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoImpressaoCartao>(){}.getType();
    }
    
    if ("HistoricoTelefone".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoTelefone>(){}.getType();
    }
    
    if ("LimiteDisponibilidade".equalsIgnoreCase(className)) {
      return new TypeToken<LimiteDisponibilidade>(){}.getType();
    }
    
    if ("ListaProdutos".equalsIgnoreCase(className)) {
      return new TypeToken<ListaProdutos>(){}.getType();
    }
    
    if ("LoteCartoesPrePagos".equalsIgnoreCase(className)) {
      return new TypeToken<LoteCartoesPrePagos>(){}.getType();
    }
    
    if ("NotificacaoPushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoPushResponse>(){}.getType();
    }
    
    if ("NotificacaoSMSBody".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoSMSBody>(){}.getType();
    }
    
    if ("NotificacaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoSMSResponse>(){}.getType();
    }
    
    if ("OrigemComercial".equalsIgnoreCase(className)) {
      return new TypeToken<OrigemComercial>(){}.getType();
    }
    
    if ("PageAtendimentoClientes".equalsIgnoreCase(className)) {
      return new TypeToken<PageAtendimentoClientes>(){}.getType();
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
    
    if ("PageFaturas".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturas>(){}.getType();
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
    
    if ("PagePush".equalsIgnoreCase(className)) {
      return new TypeToken<PagePush>(){}.getType();
    }
    
    if ("PageSMS".equalsIgnoreCase(className)) {
      return new TypeToken<PageSMS>(){}.getType();
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
    
    if ("PageTransacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacaoResponse>(){}.getType();
    }
    
    if ("PageTransferencias".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransferencias>(){}.getType();
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
    
    if ("PushAPNS".equalsIgnoreCase(className)) {
      return new TypeToken<PushAPNS>(){}.getType();
    }
    
    if ("PushFCMEGCM".equalsIgnoreCase(className)) {
      return new TypeToken<PushFCMEGCM>(){}.getType();
    }
    
    if ("SMS".equalsIgnoreCase(className)) {
      return new TypeToken<SMS>(){}.getType();
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
    
    if ("TransacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoResponse>(){}.getType();
    }
    
    if ("Transferencia".equalsIgnoreCase(className)) {
      return new TypeToken<Transferencia>(){}.getType();
    }
    
    if ("ValidaCartao".equalsIgnoreCase(className)) {
      return new TypeToken<ValidaCartao>(){}.getType();
    }
    
    if ("WebHook".equalsIgnoreCase(className)) {
      return new TypeToken<WebHook>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
