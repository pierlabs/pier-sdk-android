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
    
    if ("AjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AjusteResponse>>(){}.getType();
    }
    
    if ("AntecipacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AntecipacaoResponse>>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaDetalhesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AntecipacaoSimuladaDetalhesResponse>>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AntecipacaoSimuladaResponse>>(){}.getType();
    }
    
    if ("AplicacaoMobile".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobile>>(){}.getType();
    }
    
    if ("AplicacaoMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobilePersist>>(){}.getType();
    }
    
    if ("AplicacaoMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobileUpdate>>(){}.getType();
    }
    
    if ("AtendimentoCliente".equalsIgnoreCase(className)) {
      return new TypeToken<List<AtendimentoCliente>>(){}.getType();
    }
    
    if ("AuthToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthToken>>(){}.getType();
    }
    
    if ("AutorizacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AutorizacaoOnUsRequest>>(){}.getType();
    }
    
    if ("Banco".equalsIgnoreCase(className)) {
      return new TypeToken<List<Banco>>(){}.getType();
    }
    
    if ("Base".equalsIgnoreCase(className)) {
      return new TypeToken<List<Base>>(){}.getType();
    }
    
    if ("BodyAccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<BodyAccessToken>>(){}.getType();
    }
    
    if ("BoletoDeFatura".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoletoDeFatura>>(){}.getType();
    }
    
    if ("CampoCodificadoDescricaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CampoCodificadoDescricaoResponse>>(){}.getType();
    }
    
    if ("CancelamentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancelamentoTransacaoOnUsRequest>>(){}.getType();
    }
    
    if ("Cartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<Cartao>>(){}.getType();
    }
    
    if ("CartaoDetalhado".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoDetalhado>>(){}.getType();
    }
    
    if ("CartaoImpressao".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoImpressao>>(){}.getType();
    }
    
    if ("CdtDetalheOportunidadeAUD".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtDetalheOportunidadeAUD>>(){}.getType();
    }
    
    if ("CompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompraResponse>>(){}.getType();
    }
    
    if ("ContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDetalheResponse>>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaResponse>>(){}.getType();
    }
    
    if ("DadosCarto".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosCarto>>(){}.getType();
    }
    
    if ("DesfazimentoTransacaoOnURequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<DesfazimentoTransacaoOnURequest>>(){}.getType();
    }
    
    if ("DetalheOportunidadePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalheOportunidadePersist>>(){}.getType();
    }
    
    if ("DetalheOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalheOportunidadeResponse>>(){}.getType();
    }
    
    if ("DetalheOportunidadeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalheOportunidadeUpdate>>(){}.getType();
    }
    
    if ("DetalhesFaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalhesFaturaConsignadaResponse>>(){}.getType();
    }
    
    if ("DetalhesFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalhesFaturaResponse>>(){}.getType();
    }
    
    if ("Dispositivo".equalsIgnoreCase(className)) {
      return new TypeToken<List<Dispositivo>>(){}.getType();
    }
    
    if ("DispositivoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispositivoPersist>>(){}.getType();
    }
    
    if ("DividaClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DividaClienteResponse>>(){}.getType();
    }
    
    if ("Endereco".equalsIgnoreCase(className)) {
      return new TypeToken<List<Endereco>>(){}.getType();
    }
    
    if ("EnderecoAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoAprovadoPersist>>(){}.getType();
    }
    
    if ("EnderecoAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoAprovadoResponse>>(){}.getType();
    }
    
    if ("Estabelecimento".equalsIgnoreCase(className)) {
      return new TypeToken<List<Estabelecimento>>(){}.getType();
    }
    
    if ("EstagioCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstagioCartao>>(){}.getType();
    }
    
    if ("ExtraInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtraInfo>>(){}.getType();
    }
    
    if ("FAQ".equalsIgnoreCase(className)) {
      return new TypeToken<List<FAQ>>(){}.getType();
    }
    
    if ("FaturaConsignadaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaConsignadaDetalheResponse>>(){}.getType();
    }
    
    if ("FaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaConsignadaResponse>>(){}.getType();
    }
    
    if ("FaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaResponse>>(){}.getType();
    }
    
    if ("HistoricoAtrasoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoAtrasoFaturaResponse>>(){}.getType();
    }
    
    if ("HistoricoEventos".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoEventos>>(){}.getType();
    }
    
    if ("HistoricoImpressaoCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoImpressaoCartao>>(){}.getType();
    }
    
    if ("HistoricoTelefone".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoTelefone>>(){}.getType();
    }
    
    if ("Job".equalsIgnoreCase(className)) {
      return new TypeToken<List<Job>>(){}.getType();
    }
    
    if ("LimiteDisponibilidade".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimiteDisponibilidade>>(){}.getType();
    }
    
    if ("LinkHistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LinkHistoricoAssessoriaResponse>>(){}.getType();
    }
    
    if ("LinkPageHistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LinkPageHistoricoAssessoriaResponse>>(){}.getType();
    }
    
    if ("LinkPageTransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LinkPageTransferenciaBancariaResponse>>(){}.getType();
    }
    
    if ("LinkTransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LinkTransferenciaBancariaResponse>>(){}.getType();
    }
    
    if ("ListaProdutos".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListaProdutos>>(){}.getType();
    }
    
    if ("LoteCartoesPrePagos".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoteCartoesPrePagos>>(){}.getType();
    }
    
    if ("MapOfstringAndstring".equalsIgnoreCase(className)) {
      return new TypeToken<List<MapOfstringAndstring>>(){}.getType();
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
    
    if ("OportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("OportunidadePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadePersist>>(){}.getType();
    }
    
    if ("OportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadeResponse>>(){}.getType();
    }
    
    if ("OportunidadeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadeUpdate>>(){}.getType();
    }
    
    if ("OrigemComercial".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrigemComercial>>(){}.getType();
    }
    
    if ("PageAplicacoesMobile".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAplicacoesMobile>>(){}.getType();
    }
    
    if ("PageAtendimentoClientes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAtendimentoClientes>>(){}.getType();
    }
    
    if ("PageBancos".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageBancos>>(){}.getType();
    }
    
    if ("PageBases".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageBases>>(){}.getType();
    }
    
    if ("PageCampoCodificadoDescricao".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCampoCodificadoDescricao>>(){}.getType();
    }
    
    if ("PageCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCartoes>>(){}.getType();
    }
    
    if ("PageCompras".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCompras>>(){}.getType();
    }
    
    if ("PageContas".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContas>>(){}.getType();
    }
    
    if ("PageContasDetalhe".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContasDetalhe>>(){}.getType();
    }
    
    if ("PageDispositivos".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageDispositivos>>(){}.getType();
    }
    
    if ("PageEnderecos".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEnderecos>>(){}.getType();
    }
    
    if ("PageEstabelecimentos".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEstabelecimentos>>(){}.getType();
    }
    
    if ("PageEstagiosCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEstagiosCartoes>>(){}.getType();
    }
    
    if ("PageFaqs".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaqs>>(){}.getType();
    }
    
    if ("PageFaturas".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturas>>(){}.getType();
    }
    
    if ("PageFaturasConsignadas".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturasConsignadas>>(){}.getType();
    }
    
    if ("PageHistoricoAtraso".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoAtraso>>(){}.getType();
    }
    
    if ("PageHistoricoEventos".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoEventos>>(){}.getType();
    }
    
    if ("PageJob".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageJob>>(){}.getType();
    }
    
    if ("PageLoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageLoteCartoesPrePagosResponse>>(){}.getType();
    }
    
    if ("PageOprtunidadeAUD".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOprtunidadeAUD>>(){}.getType();
    }
    
    if ("PageOprtunidadesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOprtunidadesResponse>>(){}.getType();
    }
    
    if ("PageOrigensComerciais".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOrigensComerciais>>(){}.getType();
    }
    
    if ("PagePaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePaisResponse>>(){}.getType();
    }
    
    if ("PagePessoas".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePessoas>>(){}.getType();
    }
    
    if ("PagePlataformasMobile".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePlataformasMobile>>(){}.getType();
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
    
    if ("PageStatusOprtunidades".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusOprtunidades>>(){}.getType();
    }
    
    if ("PageStatusOprtunidadesAUD".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusOprtunidadesAUD>>(){}.getType();
    }
    
    if ("PageTaxasRefinanciamento".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTaxasRefinanciamento>>(){}.getType();
    }
    
    if ("PageTelefones".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTelefones>>(){}.getType();
    }
    
    if ("PageTerminal".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTerminal>>(){}.getType();
    }
    
    if ("PageTipoAjuste".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoAjuste>>(){}.getType();
    }
    
    if ("PageTipoBoleto".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoBoleto>>(){}.getType();
    }
    
    if ("PageTipoOprtunidades".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoOprtunidades>>(){}.getType();
    }
    
    if ("PageTipoOprtunidadesAUD".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoOprtunidadesAUD>>(){}.getType();
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
    
    if ("PageTransacoesCorrentes".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacoesCorrentes>>(){}.getType();
    }
    
    if ("PageTransferencias".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransferencias>>(){}.getType();
    }
    
    if ("PageUsuarios".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageUsuarios>>(){}.getType();
    }
    
    if ("PageWebHooks".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageWebHooks>>(){}.getType();
    }
    
    if ("PaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaisResponse>>(){}.getType();
    }
    
    if ("ParametroProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroProdutoResponse>>(){}.getType();
    }
    
    if ("Pessoa".equalsIgnoreCase(className)) {
      return new TypeToken<List<Pessoa>>(){}.getType();
    }
    
    if ("PessoaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaDetalheResponse>>(){}.getType();
    }
    
    if ("PessoaFisicaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaFisicaAprovadaPersist>>(){}.getType();
    }
    
    if ("PessoaFisicaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaFisicaAprovadaResponse>>(){}.getType();
    }
    
    if ("PessoaJuridicaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaJuridicaAprovadaPersist>>(){}.getType();
    }
    
    if ("PessoaJuridicaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaJuridicaAprovadaResponse>>(){}.getType();
    }
    
    if ("PessoaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaPersist>>(){}.getType();
    }
    
    if ("PlataformaMobile".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobile>>(){}.getType();
    }
    
    if ("PlataformaMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobilePersist>>(){}.getType();
    }
    
    if ("PlataformaMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobileUpdate>>(){}.getType();
    }
    
    if ("Portador".equalsIgnoreCase(className)) {
      return new TypeToken<List<Portador>>(){}.getType();
    }
    
    if ("ProdutoDetalhesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProdutoDetalhesResponse>>(){}.getType();
    }
    
    if ("ProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProdutoResponse>>(){}.getType();
    }
    
    if ("PushAPNS".equalsIgnoreCase(className)) {
      return new TypeToken<List<PushAPNS>>(){}.getType();
    }
    
    if ("PushFCMEGCM".equalsIgnoreCase(className)) {
      return new TypeToken<List<PushFCMEGCM>>(){}.getType();
    }
    
    if ("RiscoFraudeDetalhadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiscoFraudeDetalhadoResponse>>(){}.getType();
    }
    
    if ("RiscoFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiscoFraudeResponse>>(){}.getType();
    }
    
    if ("RiscoFraudeResponsePage".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiscoFraudeResponsePage>>(){}.getType();
    }
    
    if ("SMS".equalsIgnoreCase(className)) {
      return new TypeToken<List<SMS>>(){}.getType();
    }
    
    if ("SocioAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SocioAprovadoResponse>>(){}.getType();
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
    
    if ("StatusOportunidade".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOportunidade>>(){}.getType();
    }
    
    if ("StatusOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("StatusOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOportunidadeResponse>>(){}.getType();
    }
    
    if ("TaxaAntecipacaoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaxaAntecipacaoRequest>>(){}.getType();
    }
    
    if ("TaxasRefinanciamento".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaxasRefinanciamento>>(){}.getType();
    }
    
    if ("Telefone".equalsIgnoreCase(className)) {
      return new TypeToken<List<Telefone>>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefonePessoaAprovadaPersist>>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefonePessoaAprovadaResponse>>(){}.getType();
    }
    
    if ("Terminal".equalsIgnoreCase(className)) {
      return new TypeToken<List<Terminal>>(){}.getType();
    }
    
    if ("TipoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoAjusteResponse>>(){}.getType();
    }
    
    if ("TipoEndereco".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoEndereco>>(){}.getType();
    }
    
    if ("TipoOportunidade".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOportunidade>>(){}.getType();
    }
    
    if ("TipoOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("TipoOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOportunidadeResponse>>(){}.getType();
    }
    
    if ("TipoTelefone".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTelefone>>(){}.getType();
    }
    
    if ("Token".equalsIgnoreCase(className)) {
      return new TypeToken<List<Token>>(){}.getType();
    }
    
    if ("TransacaoCorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoCorrenteResponse>>(){}.getType();
    }
    
    if ("TransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoOnUsRequest>>(){}.getType();
    }
    
    if ("TransacaoOnUsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoOnUsResponse>>(){}.getType();
    }
    
    if ("TransacoesCorrentes".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacoesCorrentes>>(){}.getType();
    }
    
    if ("Transferencia".equalsIgnoreCase(className)) {
      return new TypeToken<List<Transferencia>>(){}.getType();
    }
    
    if ("TransferenciaBancariaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaBancariaPersist>>(){}.getType();
    }
    
    if ("UsuarioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioPersist>>(){}.getType();
    }
    
    if ("UsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioResponse>>(){}.getType();
    }
    
    if ("UsuarioUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioUpdate>>(){}.getType();
    }
    
    if ("ValidaCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidaCartao>>(){}.getType();
    }
    
    if ("ValidaSenhaCartao".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidaSenhaCartao>>(){}.getType();
    }
    
    if ("WebHook".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebHook>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AjusteResponse>(){}.getType();
    }
    
    if ("AntecipacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AntecipacaoResponse>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaDetalhesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AntecipacaoSimuladaDetalhesResponse>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AntecipacaoSimuladaResponse>(){}.getType();
    }
    
    if ("AplicacaoMobile".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobile>(){}.getType();
    }
    
    if ("AplicacaoMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobilePersist>(){}.getType();
    }
    
    if ("AplicacaoMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobileUpdate>(){}.getType();
    }
    
    if ("AtendimentoCliente".equalsIgnoreCase(className)) {
      return new TypeToken<AtendimentoCliente>(){}.getType();
    }
    
    if ("AuthToken".equalsIgnoreCase(className)) {
      return new TypeToken<AuthToken>(){}.getType();
    }
    
    if ("AutorizacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AutorizacaoOnUsRequest>(){}.getType();
    }
    
    if ("Banco".equalsIgnoreCase(className)) {
      return new TypeToken<Banco>(){}.getType();
    }
    
    if ("Base".equalsIgnoreCase(className)) {
      return new TypeToken<Base>(){}.getType();
    }
    
    if ("BodyAccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<BodyAccessToken>(){}.getType();
    }
    
    if ("BoletoDeFatura".equalsIgnoreCase(className)) {
      return new TypeToken<BoletoDeFatura>(){}.getType();
    }
    
    if ("CampoCodificadoDescricaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CampoCodificadoDescricaoResponse>(){}.getType();
    }
    
    if ("CancelamentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CancelamentoTransacaoOnUsRequest>(){}.getType();
    }
    
    if ("Cartao".equalsIgnoreCase(className)) {
      return new TypeToken<Cartao>(){}.getType();
    }
    
    if ("CartaoDetalhado".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoDetalhado>(){}.getType();
    }
    
    if ("CartaoImpressao".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoImpressao>(){}.getType();
    }
    
    if ("CdtDetalheOportunidadeAUD".equalsIgnoreCase(className)) {
      return new TypeToken<CdtDetalheOportunidadeAUD>(){}.getType();
    }
    
    if ("CompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CompraResponse>(){}.getType();
    }
    
    if ("ContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDetalheResponse>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaResponse>(){}.getType();
    }
    
    if ("DadosCarto".equalsIgnoreCase(className)) {
      return new TypeToken<DadosCarto>(){}.getType();
    }
    
    if ("DesfazimentoTransacaoOnURequest".equalsIgnoreCase(className)) {
      return new TypeToken<DesfazimentoTransacaoOnURequest>(){}.getType();
    }
    
    if ("DetalheOportunidadePersist".equalsIgnoreCase(className)) {
      return new TypeToken<DetalheOportunidadePersist>(){}.getType();
    }
    
    if ("DetalheOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalheOportunidadeResponse>(){}.getType();
    }
    
    if ("DetalheOportunidadeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<DetalheOportunidadeUpdate>(){}.getType();
    }
    
    if ("DetalhesFaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalhesFaturaConsignadaResponse>(){}.getType();
    }
    
    if ("DetalhesFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalhesFaturaResponse>(){}.getType();
    }
    
    if ("Dispositivo".equalsIgnoreCase(className)) {
      return new TypeToken<Dispositivo>(){}.getType();
    }
    
    if ("DispositivoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<DispositivoPersist>(){}.getType();
    }
    
    if ("DividaClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DividaClienteResponse>(){}.getType();
    }
    
    if ("Endereco".equalsIgnoreCase(className)) {
      return new TypeToken<Endereco>(){}.getType();
    }
    
    if ("EnderecoAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoAprovadoPersist>(){}.getType();
    }
    
    if ("EnderecoAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoAprovadoResponse>(){}.getType();
    }
    
    if ("Estabelecimento".equalsIgnoreCase(className)) {
      return new TypeToken<Estabelecimento>(){}.getType();
    }
    
    if ("EstagioCartao".equalsIgnoreCase(className)) {
      return new TypeToken<EstagioCartao>(){}.getType();
    }
    
    if ("ExtraInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ExtraInfo>(){}.getType();
    }
    
    if ("FAQ".equalsIgnoreCase(className)) {
      return new TypeToken<FAQ>(){}.getType();
    }
    
    if ("FaturaConsignadaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaConsignadaDetalheResponse>(){}.getType();
    }
    
    if ("FaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaConsignadaResponse>(){}.getType();
    }
    
    if ("FaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaResponse>(){}.getType();
    }
    
    if ("HistoricoAtrasoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoAtrasoFaturaResponse>(){}.getType();
    }
    
    if ("HistoricoEventos".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoEventos>(){}.getType();
    }
    
    if ("HistoricoImpressaoCartao".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoImpressaoCartao>(){}.getType();
    }
    
    if ("HistoricoTelefone".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoTelefone>(){}.getType();
    }
    
    if ("Job".equalsIgnoreCase(className)) {
      return new TypeToken<Job>(){}.getType();
    }
    
    if ("LimiteDisponibilidade".equalsIgnoreCase(className)) {
      return new TypeToken<LimiteDisponibilidade>(){}.getType();
    }
    
    if ("LinkHistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LinkHistoricoAssessoriaResponse>(){}.getType();
    }
    
    if ("LinkPageHistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LinkPageHistoricoAssessoriaResponse>(){}.getType();
    }
    
    if ("LinkPageTransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LinkPageTransferenciaBancariaResponse>(){}.getType();
    }
    
    if ("LinkTransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LinkTransferenciaBancariaResponse>(){}.getType();
    }
    
    if ("ListaProdutos".equalsIgnoreCase(className)) {
      return new TypeToken<ListaProdutos>(){}.getType();
    }
    
    if ("LoteCartoesPrePagos".equalsIgnoreCase(className)) {
      return new TypeToken<LoteCartoesPrePagos>(){}.getType();
    }
    
    if ("MapOfstringAndstring".equalsIgnoreCase(className)) {
      return new TypeToken<MapOfstringAndstring>(){}.getType();
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
    
    if ("OportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadeAUDResponse>(){}.getType();
    }
    
    if ("OportunidadePersist".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadePersist>(){}.getType();
    }
    
    if ("OportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadeResponse>(){}.getType();
    }
    
    if ("OportunidadeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadeUpdate>(){}.getType();
    }
    
    if ("OrigemComercial".equalsIgnoreCase(className)) {
      return new TypeToken<OrigemComercial>(){}.getType();
    }
    
    if ("PageAplicacoesMobile".equalsIgnoreCase(className)) {
      return new TypeToken<PageAplicacoesMobile>(){}.getType();
    }
    
    if ("PageAtendimentoClientes".equalsIgnoreCase(className)) {
      return new TypeToken<PageAtendimentoClientes>(){}.getType();
    }
    
    if ("PageBancos".equalsIgnoreCase(className)) {
      return new TypeToken<PageBancos>(){}.getType();
    }
    
    if ("PageBases".equalsIgnoreCase(className)) {
      return new TypeToken<PageBases>(){}.getType();
    }
    
    if ("PageCampoCodificadoDescricao".equalsIgnoreCase(className)) {
      return new TypeToken<PageCampoCodificadoDescricao>(){}.getType();
    }
    
    if ("PageCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<PageCartoes>(){}.getType();
    }
    
    if ("PageCompras".equalsIgnoreCase(className)) {
      return new TypeToken<PageCompras>(){}.getType();
    }
    
    if ("PageContas".equalsIgnoreCase(className)) {
      return new TypeToken<PageContas>(){}.getType();
    }
    
    if ("PageContasDetalhe".equalsIgnoreCase(className)) {
      return new TypeToken<PageContasDetalhe>(){}.getType();
    }
    
    if ("PageDispositivos".equalsIgnoreCase(className)) {
      return new TypeToken<PageDispositivos>(){}.getType();
    }
    
    if ("PageEnderecos".equalsIgnoreCase(className)) {
      return new TypeToken<PageEnderecos>(){}.getType();
    }
    
    if ("PageEstabelecimentos".equalsIgnoreCase(className)) {
      return new TypeToken<PageEstabelecimentos>(){}.getType();
    }
    
    if ("PageEstagiosCartoes".equalsIgnoreCase(className)) {
      return new TypeToken<PageEstagiosCartoes>(){}.getType();
    }
    
    if ("PageFaqs".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaqs>(){}.getType();
    }
    
    if ("PageFaturas".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturas>(){}.getType();
    }
    
    if ("PageFaturasConsignadas".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturasConsignadas>(){}.getType();
    }
    
    if ("PageHistoricoAtraso".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoAtraso>(){}.getType();
    }
    
    if ("PageHistoricoEventos".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoEventos>(){}.getType();
    }
    
    if ("PageJob".equalsIgnoreCase(className)) {
      return new TypeToken<PageJob>(){}.getType();
    }
    
    if ("PageLoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageLoteCartoesPrePagosResponse>(){}.getType();
    }
    
    if ("PageOprtunidadeAUD".equalsIgnoreCase(className)) {
      return new TypeToken<PageOprtunidadeAUD>(){}.getType();
    }
    
    if ("PageOprtunidadesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageOprtunidadesResponse>(){}.getType();
    }
    
    if ("PageOrigensComerciais".equalsIgnoreCase(className)) {
      return new TypeToken<PageOrigensComerciais>(){}.getType();
    }
    
    if ("PagePaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePaisResponse>(){}.getType();
    }
    
    if ("PagePessoas".equalsIgnoreCase(className)) {
      return new TypeToken<PagePessoas>(){}.getType();
    }
    
    if ("PagePlataformasMobile".equalsIgnoreCase(className)) {
      return new TypeToken<PagePlataformasMobile>(){}.getType();
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
    
    if ("PageStatusOprtunidades".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusOprtunidades>(){}.getType();
    }
    
    if ("PageStatusOprtunidadesAUD".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusOprtunidadesAUD>(){}.getType();
    }
    
    if ("PageTaxasRefinanciamento".equalsIgnoreCase(className)) {
      return new TypeToken<PageTaxasRefinanciamento>(){}.getType();
    }
    
    if ("PageTelefones".equalsIgnoreCase(className)) {
      return new TypeToken<PageTelefones>(){}.getType();
    }
    
    if ("PageTerminal".equalsIgnoreCase(className)) {
      return new TypeToken<PageTerminal>(){}.getType();
    }
    
    if ("PageTipoAjuste".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoAjuste>(){}.getType();
    }
    
    if ("PageTipoBoleto".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoBoleto>(){}.getType();
    }
    
    if ("PageTipoOprtunidades".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoOprtunidades>(){}.getType();
    }
    
    if ("PageTipoOprtunidadesAUD".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoOprtunidadesAUD>(){}.getType();
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
    
    if ("PageTransacoesCorrentes".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacoesCorrentes>(){}.getType();
    }
    
    if ("PageTransferencias".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransferencias>(){}.getType();
    }
    
    if ("PageUsuarios".equalsIgnoreCase(className)) {
      return new TypeToken<PageUsuarios>(){}.getType();
    }
    
    if ("PageWebHooks".equalsIgnoreCase(className)) {
      return new TypeToken<PageWebHooks>(){}.getType();
    }
    
    if ("PaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PaisResponse>(){}.getType();
    }
    
    if ("ParametroProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroProdutoResponse>(){}.getType();
    }
    
    if ("Pessoa".equalsIgnoreCase(className)) {
      return new TypeToken<Pessoa>(){}.getType();
    }
    
    if ("PessoaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaDetalheResponse>(){}.getType();
    }
    
    if ("PessoaFisicaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaFisicaAprovadaPersist>(){}.getType();
    }
    
    if ("PessoaFisicaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaFisicaAprovadaResponse>(){}.getType();
    }
    
    if ("PessoaJuridicaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaJuridicaAprovadaPersist>(){}.getType();
    }
    
    if ("PessoaJuridicaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaJuridicaAprovadaResponse>(){}.getType();
    }
    
    if ("PessoaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaPersist>(){}.getType();
    }
    
    if ("PlataformaMobile".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobile>(){}.getType();
    }
    
    if ("PlataformaMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobilePersist>(){}.getType();
    }
    
    if ("PlataformaMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobileUpdate>(){}.getType();
    }
    
    if ("Portador".equalsIgnoreCase(className)) {
      return new TypeToken<Portador>(){}.getType();
    }
    
    if ("ProdutoDetalhesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProdutoDetalhesResponse>(){}.getType();
    }
    
    if ("ProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProdutoResponse>(){}.getType();
    }
    
    if ("PushAPNS".equalsIgnoreCase(className)) {
      return new TypeToken<PushAPNS>(){}.getType();
    }
    
    if ("PushFCMEGCM".equalsIgnoreCase(className)) {
      return new TypeToken<PushFCMEGCM>(){}.getType();
    }
    
    if ("RiscoFraudeDetalhadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RiscoFraudeDetalhadoResponse>(){}.getType();
    }
    
    if ("RiscoFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RiscoFraudeResponse>(){}.getType();
    }
    
    if ("RiscoFraudeResponsePage".equalsIgnoreCase(className)) {
      return new TypeToken<RiscoFraudeResponsePage>(){}.getType();
    }
    
    if ("SMS".equalsIgnoreCase(className)) {
      return new TypeToken<SMS>(){}.getType();
    }
    
    if ("SocioAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SocioAprovadoResponse>(){}.getType();
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
    
    if ("StatusOportunidade".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOportunidade>(){}.getType();
    }
    
    if ("StatusOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("StatusOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOportunidadeResponse>(){}.getType();
    }
    
    if ("TaxaAntecipacaoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TaxaAntecipacaoRequest>(){}.getType();
    }
    
    if ("TaxasRefinanciamento".equalsIgnoreCase(className)) {
      return new TypeToken<TaxasRefinanciamento>(){}.getType();
    }
    
    if ("Telefone".equalsIgnoreCase(className)) {
      return new TypeToken<Telefone>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TelefonePessoaAprovadaPersist>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TelefonePessoaAprovadaResponse>(){}.getType();
    }
    
    if ("Terminal".equalsIgnoreCase(className)) {
      return new TypeToken<Terminal>(){}.getType();
    }
    
    if ("TipoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoAjusteResponse>(){}.getType();
    }
    
    if ("TipoEndereco".equalsIgnoreCase(className)) {
      return new TypeToken<TipoEndereco>(){}.getType();
    }
    
    if ("TipoOportunidade".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOportunidade>(){}.getType();
    }
    
    if ("TipoOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("TipoOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOportunidadeResponse>(){}.getType();
    }
    
    if ("TipoTelefone".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTelefone>(){}.getType();
    }
    
    if ("Token".equalsIgnoreCase(className)) {
      return new TypeToken<Token>(){}.getType();
    }
    
    if ("TransacaoCorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoCorrenteResponse>(){}.getType();
    }
    
    if ("TransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoOnUsRequest>(){}.getType();
    }
    
    if ("TransacaoOnUsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoOnUsResponse>(){}.getType();
    }
    
    if ("TransacoesCorrentes".equalsIgnoreCase(className)) {
      return new TypeToken<TransacoesCorrentes>(){}.getType();
    }
    
    if ("Transferencia".equalsIgnoreCase(className)) {
      return new TypeToken<Transferencia>(){}.getType();
    }
    
    if ("TransferenciaBancariaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaBancariaPersist>(){}.getType();
    }
    
    if ("UsuarioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioPersist>(){}.getType();
    }
    
    if ("UsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioResponse>(){}.getType();
    }
    
    if ("UsuarioUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioUpdate>(){}.getType();
    }
    
    if ("ValidaCartao".equalsIgnoreCase(className)) {
      return new TypeToken<ValidaCartao>(){}.getType();
    }
    
    if ("ValidaSenhaCartao".equalsIgnoreCase(className)) {
      return new TypeToken<ValidaSenhaCartao>(){}.getType();
    }
    
    if ("WebHook".equalsIgnoreCase(className)) {
      return new TypeToken<WebHook>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
