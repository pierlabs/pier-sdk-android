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
    
    if ("AdicionalDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdicionalDetalheResponse>>(){}.getType();
    }
    
    if ("AdicionalPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdicionalPersist>>(){}.getType();
    }
    
    if ("AdicionalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdicionalResponse>>(){}.getType();
    }
    
    if ("AdicionalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdicionalUpdate>>(){}.getType();
    }
    
    if ("AjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AjusteResponse>>(){}.getType();
    }
    
    if ("AlterarProdutoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AlterarProdutoRequest>>(){}.getType();
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
    
    if ("AnuidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AnuidadeResponse>>(){}.getType();
    }
    
    if ("AplicacaoMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobilePersist>>(){}.getType();
    }
    
    if ("AplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobileResponse>>(){}.getType();
    }
    
    if ("AplicacaoMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobileUpdate>>(){}.getType();
    }
    
    if ("ArquivoDetalhesPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArquivoDetalhesPersist>>(){}.getType();
    }
    
    if ("ArquivoParametroResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArquivoParametroResponse>>(){}.getType();
    }
    
    if ("ArquivoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArquivoPersist>>(){}.getType();
    }
    
    if ("ArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArquivoResponse>>(){}.getType();
    }
    
    if ("AtendimentoClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AtendimentoClienteResponse>>(){}.getType();
    }
    
    if ("AtribuirAssinaturaClientePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AtribuirAssinaturaClientePersist>>(){}.getType();
    }
    
    if ("AuthToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthToken>>(){}.getType();
    }
    
    if ("AutorizacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AutorizacaoOnUsRequest>>(){}.getType();
    }
    
    if ("BancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BancoResponse>>(){}.getType();
    }
    
    if ("BaseResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BaseResponse>>(){}.getType();
    }
    
    if ("BodyAccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<BodyAccessToken>>(){}.getType();
    }
    
    if ("BoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoletoResponse>>(){}.getType();
    }
    
    if ("CampoCodificadoDescricaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CampoCodificadoDescricaoResponse>>(){}.getType();
    }
    
    if ("CancelamentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancelamentoTransacaoOnUsRequest>>(){}.getType();
    }
    
    if ("CancelamentoTransacaoPorIdCartaoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancelamentoTransacaoPorIdCartaoRequest>>(){}.getType();
    }
    
    if ("CartaoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoDetalheResponse>>(){}.getType();
    }
    
    if ("CartaoEmbossingRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoEmbossingRequest>>(){}.getType();
    }
    
    if ("CartaoEmbossingResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoEmbossingResponse>>(){}.getType();
    }
    
    if ("CartaoImpressaoProvisorioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoImpressaoProvisorioResponse>>(){}.getType();
    }
    
    if ("CartaoImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoImpressaoResponse>>(){}.getType();
    }
    
    if ("CartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoResponse>>(){}.getType();
    }
    
    if ("CdtDetalheOportunidadeAUD".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtDetalheOportunidadeAUD>>(){}.getType();
    }
    
    if ("CodigoSegurancaSMSPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CodigoSegurancaSMSPersist>>(){}.getType();
    }
    
    if ("CodigoSegurancaSMSRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CodigoSegurancaSMSRequest>>(){}.getType();
    }
    
    if ("CompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompraResponse>>(){}.getType();
    }
    
    if ("ConfiguracaoEmailPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoEmailPersist>>(){}.getType();
    }
    
    if ("ConfiguracaoEmailResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoEmailResponse>>(){}.getType();
    }
    
    if ("ContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDetalheResponse>>(){}.getType();
    }
    
    if ("ContaHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaHistoricoPagamentoResponse>>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaResponse>>(){}.getType();
    }
    
    if ("ControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleVencimentoResponse>>(){}.getType();
    }
    
    if ("DadosCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosCartaoResponse>>(){}.getType();
    }
    
    if ("DesfazimentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<DesfazimentoTransacaoOnUsRequest>>(){}.getType();
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
    
    if ("DispositivoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispositivoPersist>>(){}.getType();
    }
    
    if ("DispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispositivoResponse>>(){}.getType();
    }
    
    if ("DividaClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DividaClienteResponse>>(){}.getType();
    }
    
    if ("EmprestimoPessoalRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EmprestimoPessoalRequest>>(){}.getType();
    }
    
    if ("EmprestimoPessoalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EmprestimoPessoalResponse>>(){}.getType();
    }
    
    if ("EnderecoAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoAprovadoPersist>>(){}.getType();
    }
    
    if ("EnderecoAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoAprovadoResponse>>(){}.getType();
    }
    
    if ("EnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoResponse>>(){}.getType();
    }
    
    if ("EstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstabelecimentoResponse>>(){}.getType();
    }
    
    if ("EstagioCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstagioCartaoResponse>>(){}.getType();
    }
    
    if ("ExtraInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtraInfo>>(){}.getType();
    }
    
    if ("FantasiaBasicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FantasiaBasicaResponse>>(){}.getType();
    }
    
    if ("FaqResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaqResponse>>(){}.getType();
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
    
    if ("HistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoAssessoriaResponse>>(){}.getType();
    }
    
    if ("HistoricoAtrasoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoAtrasoFaturaResponse>>(){}.getType();
    }
    
    if ("HistoricoEventosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoEventosResponse>>(){}.getType();
    }
    
    if ("HistoricoImpressaoCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoImpressaoCartaoResponse>>(){}.getType();
    }
    
    if ("HistoricoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoTelefoneResponse>>(){}.getType();
    }
    
    if ("IntegracaoEmissorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<IntegracaoEmissorPersist>>(){}.getType();
    }
    
    if ("IntegracaoEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<IntegracaoEmissorResponse>>(){}.getType();
    }
    
    if ("JobResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<JobResponse>>(){}.getType();
    }
    
    if ("LimiteDisponibilidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimiteDisponibilidadeResponse>>(){}.getType();
    }
    
    if ("LoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoteCartoesPrePagosResponse>>(){}.getType();
    }
    
    if ("MapOfstringAndstring".equalsIgnoreCase(className)) {
      return new TypeToken<List<MapOfstringAndstring>>(){}.getType();
    }
    
    if ("NotificacaoPushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoPushResponse>>(){}.getType();
    }
    
    if ("NotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoResponse>>(){}.getType();
    }
    
    if ("NotificacaoSMSBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoSMSBody>>(){}.getType();
    }
    
    if ("NotificacaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoSMSResponse>>(){}.getType();
    }
    
    if ("OperadoraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperadoraResponse>>(){}.getType();
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
    
    if ("OrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrigemComercialResponse>>(){}.getType();
    }
    
    if ("PageAnuidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAnuidadeResponse>>(){}.getType();
    }
    
    if ("PageAplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAplicacaoMobileResponse>>(){}.getType();
    }
    
    if ("PageAtendimentoClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAtendimentoClienteResponse>>(){}.getType();
    }
    
    if ("PageBancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageBancoResponse>>(){}.getType();
    }
    
    if ("PageBaseResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageBaseResponse>>(){}.getType();
    }
    
    if ("PageCampoCodificadoDescricaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCampoCodificadoDescricaoResponse>>(){}.getType();
    }
    
    if ("PageCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCartaoResponse>>(){}.getType();
    }
    
    if ("PageCompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCompraResponse>>(){}.getType();
    }
    
    if ("PageConfiguracaoEmailResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConfiguracaoEmailResponse>>(){}.getType();
    }
    
    if ("PageContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContaDetalheResponse>>(){}.getType();
    }
    
    if ("PageContaHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContaHistoricoPagamentoResponse>>(){}.getType();
    }
    
    if ("PageContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContaResponse>>(){}.getType();
    }
    
    if ("PageControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageControleVencimentoResponse>>(){}.getType();
    }
    
    if ("PageDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageDispositivoResponse>>(){}.getType();
    }
    
    if ("PageEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEnderecoResponse>>(){}.getType();
    }
    
    if ("PageEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEstabelecimentoResponse>>(){}.getType();
    }
    
    if ("PageEstagioCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEstagioCartaoResponse>>(){}.getType();
    }
    
    if ("PageFantasiaBasicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFantasiaBasicaResponse>>(){}.getType();
    }
    
    if ("PageFaqResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaqResponse>>(){}.getType();
    }
    
    if ("PageFaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturaConsignadaResponse>>(){}.getType();
    }
    
    if ("PageFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturaResponse>>(){}.getType();
    }
    
    if ("PageHistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoAssessoriaResponse>>(){}.getType();
    }
    
    if ("PageHistoricoAtrasoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoAtrasoFaturaResponse>>(){}.getType();
    }
    
    if ("PageHistoricoEventosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoEventosResponse>>(){}.getType();
    }
    
    if ("PageJobResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageJobResponse>>(){}.getType();
    }
    
    if ("PageLoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageLoteCartoesPrePagosResponse>>(){}.getType();
    }
    
    if ("PageOperadoraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOperadoraResponse>>(){}.getType();
    }
    
    if ("PageOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("PageOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOportunidadeResponse>>(){}.getType();
    }
    
    if ("PageOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOrigemComercialResponse>>(){}.getType();
    }
    
    if ("PagePaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePaisResponse>>(){}.getType();
    }
    
    if ("PagePessoaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePessoaDetalheResponse>>(){}.getType();
    }
    
    if ("PagePessoaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePessoaResponse>>(){}.getType();
    }
    
    if ("PagePlanoParcelamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePlanoParcelamentoResponse>>(){}.getType();
    }
    
    if ("PagePlataformaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePlataformaMobileResponse>>(){}.getType();
    }
    
    if ("PagePortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePortadorResponse>>(){}.getType();
    }
    
    if ("PageProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageProdutoResponse>>(){}.getType();
    }
    
    if ("PagePromotorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePromotorResponse>>(){}.getType();
    }
    
    if ("PagePushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePushResponse>>(){}.getType();
    }
    
    if ("PageRiscoFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageRiscoFraudeResponse>>(){}.getType();
    }
    
    if ("PageSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSMSResponse>>(){}.getType();
    }
    
    if ("PageStatusCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusCartaoResponse>>(){}.getType();
    }
    
    if ("PageStatusContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusContaResponse>>(){}.getType();
    }
    
    if ("PageStatusImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusImpressaoResponse>>(){}.getType();
    }
    
    if ("PageStatusOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("PageStatusOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusOportunidadeResponse>>(){}.getType();
    }
    
    if ("PageTaxasRefinanciamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTaxasRefinanciamentoResponse>>(){}.getType();
    }
    
    if ("PageTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTelefoneResponse>>(){}.getType();
    }
    
    if ("PageTemplateNotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTemplateNotificacaoResponse>>(){}.getType();
    }
    
    if ("PageTerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTerminalResponse>>(){}.getType();
    }
    
    if ("PageTipoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoAjusteResponse>>(){}.getType();
    }
    
    if ("PageTipoBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoBoletoResponse>>(){}.getType();
    }
    
    if ("PageTipoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoEnderecoResponse>>(){}.getType();
    }
    
    if ("PageTipoOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("PageTipoOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoOportunidadeResponse>>(){}.getType();
    }
    
    if ("PageTipoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoTelefoneResponse>>(){}.getType();
    }
    
    if ("PageTransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacaoNaoProcessadaResponse>>(){}.getType();
    }
    
    if ("PageTransacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacaoResponse>>(){}.getType();
    }
    
    if ("PageTransacoesCorrentesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacoesCorrentesResponse>>(){}.getType();
    }
    
    if ("PageTransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransferenciaBancariaResponse>>(){}.getType();
    }
    
    if ("PageTransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransferenciaResponse>>(){}.getType();
    }
    
    if ("PageUsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageUsuarioResponse>>(){}.getType();
    }
    
    if ("PageWebHookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageWebHookResponse>>(){}.getType();
    }
    
    if ("PaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaisResponse>>(){}.getType();
    }
    
    if ("ParametroProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroProdutoResponse>>(){}.getType();
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
    
    if ("PessoaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaResponse>>(){}.getType();
    }
    
    if ("PlanoParcelamentoEmprestimoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoParcelamentoEmprestimoResponse>>(){}.getType();
    }
    
    if ("PlanoParcelamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoParcelamentoResponse>>(){}.getType();
    }
    
    if ("PlataformaMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobilePersist>>(){}.getType();
    }
    
    if ("PlataformaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobileResponse>>(){}.getType();
    }
    
    if ("PlataformaMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobileUpdate>>(){}.getType();
    }
    
    if ("PortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PortadorResponse>>(){}.getType();
    }
    
    if ("ProdutoDetalhesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProdutoDetalhesResponse>>(){}.getType();
    }
    
    if ("ProdutoOrigemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProdutoOrigemResponse>>(){}.getType();
    }
    
    if ("ProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProdutoResponse>>(){}.getType();
    }
    
    if ("PromotorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PromotorResponse>>(){}.getType();
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
    
    if ("SocioAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SocioAprovadoResponse>>(){}.getType();
    }
    
    if ("StatusCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusCartaoResponse>>(){}.getType();
    }
    
    if ("StatusContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusContaResponse>>(){}.getType();
    }
    
    if ("StatusImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusImpressaoResponse>>(){}.getType();
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
    
    if ("TaxasRefinanciamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaxasRefinanciamentoResponse>>(){}.getType();
    }
    
    if ("TelefoneAdicionalPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneAdicionalPersist>>(){}.getType();
    }
    
    if ("TelefoneAdicionalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneAdicionalUpdate>>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefonePessoaAprovadaPersist>>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefonePessoaAprovadaResponse>>(){}.getType();
    }
    
    if ("TelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneResponse>>(){}.getType();
    }
    
    if ("TemplateNotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TemplateNotificacaoResponse>>(){}.getType();
    }
    
    if ("TerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TerminalResponse>>(){}.getType();
    }
    
    if ("TipoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoAjusteResponse>>(){}.getType();
    }
    
    if ("TipoBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoBoletoResponse>>(){}.getType();
    }
    
    if ("TipoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoEnderecoResponse>>(){}.getType();
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
    
    if ("TipoResolucaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoResolucaoResponse>>(){}.getType();
    }
    
    if ("TipoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTelefoneResponse>>(){}.getType();
    }
    
    if ("TokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenResponse>>(){}.getType();
    }
    
    if ("TransacaoCorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoCorrenteResponse>>(){}.getType();
    }
    
    if ("TransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoNaoProcessadaResponse>>(){}.getType();
    }
    
    if ("TransacaoOnUsPorIdCartaoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoOnUsPorIdCartaoRequest>>(){}.getType();
    }
    
    if ("TransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoOnUsRequest>>(){}.getType();
    }
    
    if ("TransacaoOnUsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoOnUsResponse>>(){}.getType();
    }
    
    if ("TransacoesCorrentesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacoesCorrentesResponse>>(){}.getType();
    }
    
    if ("TransferenciaBancariaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaBancariaPersist>>(){}.getType();
    }
    
    if ("TransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaBancariaResponse>>(){}.getType();
    }
    
    if ("TransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaResponse>>(){}.getType();
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
    
    if ("ValidaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidaCartaoResponse>>(){}.getType();
    }
    
    if ("ValidaSenhaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidaSenhaCartaoResponse>>(){}.getType();
    }
    
    if ("WebHookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebHookResponse>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AdicionalDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AdicionalDetalheResponse>(){}.getType();
    }
    
    if ("AdicionalPersist".equalsIgnoreCase(className)) {
      return new TypeToken<AdicionalPersist>(){}.getType();
    }
    
    if ("AdicionalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AdicionalResponse>(){}.getType();
    }
    
    if ("AdicionalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<AdicionalUpdate>(){}.getType();
    }
    
    if ("AjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AjusteResponse>(){}.getType();
    }
    
    if ("AlterarProdutoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AlterarProdutoRequest>(){}.getType();
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
    
    if ("AnuidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AnuidadeResponse>(){}.getType();
    }
    
    if ("AplicacaoMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobilePersist>(){}.getType();
    }
    
    if ("AplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobileResponse>(){}.getType();
    }
    
    if ("AplicacaoMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobileUpdate>(){}.getType();
    }
    
    if ("ArquivoDetalhesPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ArquivoDetalhesPersist>(){}.getType();
    }
    
    if ("ArquivoParametroResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ArquivoParametroResponse>(){}.getType();
    }
    
    if ("ArquivoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ArquivoPersist>(){}.getType();
    }
    
    if ("ArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ArquivoResponse>(){}.getType();
    }
    
    if ("AtendimentoClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AtendimentoClienteResponse>(){}.getType();
    }
    
    if ("AtribuirAssinaturaClientePersist".equalsIgnoreCase(className)) {
      return new TypeToken<AtribuirAssinaturaClientePersist>(){}.getType();
    }
    
    if ("AuthToken".equalsIgnoreCase(className)) {
      return new TypeToken<AuthToken>(){}.getType();
    }
    
    if ("AutorizacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AutorizacaoOnUsRequest>(){}.getType();
    }
    
    if ("BancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BancoResponse>(){}.getType();
    }
    
    if ("BaseResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BaseResponse>(){}.getType();
    }
    
    if ("BodyAccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<BodyAccessToken>(){}.getType();
    }
    
    if ("BoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BoletoResponse>(){}.getType();
    }
    
    if ("CampoCodificadoDescricaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CampoCodificadoDescricaoResponse>(){}.getType();
    }
    
    if ("CancelamentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CancelamentoTransacaoOnUsRequest>(){}.getType();
    }
    
    if ("CancelamentoTransacaoPorIdCartaoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CancelamentoTransacaoPorIdCartaoRequest>(){}.getType();
    }
    
    if ("CartaoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoDetalheResponse>(){}.getType();
    }
    
    if ("CartaoEmbossingRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoEmbossingRequest>(){}.getType();
    }
    
    if ("CartaoEmbossingResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoEmbossingResponse>(){}.getType();
    }
    
    if ("CartaoImpressaoProvisorioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoImpressaoProvisorioResponse>(){}.getType();
    }
    
    if ("CartaoImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoImpressaoResponse>(){}.getType();
    }
    
    if ("CartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoResponse>(){}.getType();
    }
    
    if ("CdtDetalheOportunidadeAUD".equalsIgnoreCase(className)) {
      return new TypeToken<CdtDetalheOportunidadeAUD>(){}.getType();
    }
    
    if ("CodigoSegurancaSMSPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CodigoSegurancaSMSPersist>(){}.getType();
    }
    
    if ("CodigoSegurancaSMSRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CodigoSegurancaSMSRequest>(){}.getType();
    }
    
    if ("CompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CompraResponse>(){}.getType();
    }
    
    if ("ConfiguracaoEmailPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoEmailPersist>(){}.getType();
    }
    
    if ("ConfiguracaoEmailResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoEmailResponse>(){}.getType();
    }
    
    if ("ContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDetalheResponse>(){}.getType();
    }
    
    if ("ContaHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaHistoricoPagamentoResponse>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaResponse>(){}.getType();
    }
    
    if ("ControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ControleVencimentoResponse>(){}.getType();
    }
    
    if ("DadosCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DadosCartaoResponse>(){}.getType();
    }
    
    if ("DesfazimentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<DesfazimentoTransacaoOnUsRequest>(){}.getType();
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
    
    if ("DispositivoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<DispositivoPersist>(){}.getType();
    }
    
    if ("DispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DispositivoResponse>(){}.getType();
    }
    
    if ("DividaClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DividaClienteResponse>(){}.getType();
    }
    
    if ("EmprestimoPessoalRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EmprestimoPessoalRequest>(){}.getType();
    }
    
    if ("EmprestimoPessoalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EmprestimoPessoalResponse>(){}.getType();
    }
    
    if ("EnderecoAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoAprovadoPersist>(){}.getType();
    }
    
    if ("EnderecoAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoAprovadoResponse>(){}.getType();
    }
    
    if ("EnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoResponse>(){}.getType();
    }
    
    if ("EstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EstabelecimentoResponse>(){}.getType();
    }
    
    if ("EstagioCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EstagioCartaoResponse>(){}.getType();
    }
    
    if ("ExtraInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ExtraInfo>(){}.getType();
    }
    
    if ("FantasiaBasicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FantasiaBasicaResponse>(){}.getType();
    }
    
    if ("FaqResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaqResponse>(){}.getType();
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
    
    if ("HistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoAssessoriaResponse>(){}.getType();
    }
    
    if ("HistoricoAtrasoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoAtrasoFaturaResponse>(){}.getType();
    }
    
    if ("HistoricoEventosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoEventosResponse>(){}.getType();
    }
    
    if ("HistoricoImpressaoCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoImpressaoCartaoResponse>(){}.getType();
    }
    
    if ("HistoricoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoTelefoneResponse>(){}.getType();
    }
    
    if ("IntegracaoEmissorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<IntegracaoEmissorPersist>(){}.getType();
    }
    
    if ("IntegracaoEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<IntegracaoEmissorResponse>(){}.getType();
    }
    
    if ("JobResponse".equalsIgnoreCase(className)) {
      return new TypeToken<JobResponse>(){}.getType();
    }
    
    if ("LimiteDisponibilidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LimiteDisponibilidadeResponse>(){}.getType();
    }
    
    if ("LoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LoteCartoesPrePagosResponse>(){}.getType();
    }
    
    if ("MapOfstringAndstring".equalsIgnoreCase(className)) {
      return new TypeToken<MapOfstringAndstring>(){}.getType();
    }
    
    if ("NotificacaoPushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoPushResponse>(){}.getType();
    }
    
    if ("NotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoResponse>(){}.getType();
    }
    
    if ("NotificacaoSMSBody".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoSMSBody>(){}.getType();
    }
    
    if ("NotificacaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoSMSResponse>(){}.getType();
    }
    
    if ("OperadoraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OperadoraResponse>(){}.getType();
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
    
    if ("OrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrigemComercialResponse>(){}.getType();
    }
    
    if ("PageAnuidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAnuidadeResponse>(){}.getType();
    }
    
    if ("PageAplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAplicacaoMobileResponse>(){}.getType();
    }
    
    if ("PageAtendimentoClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAtendimentoClienteResponse>(){}.getType();
    }
    
    if ("PageBancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageBancoResponse>(){}.getType();
    }
    
    if ("PageBaseResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageBaseResponse>(){}.getType();
    }
    
    if ("PageCampoCodificadoDescricaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCampoCodificadoDescricaoResponse>(){}.getType();
    }
    
    if ("PageCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCartaoResponse>(){}.getType();
    }
    
    if ("PageCompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCompraResponse>(){}.getType();
    }
    
    if ("PageConfiguracaoEmailResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConfiguracaoEmailResponse>(){}.getType();
    }
    
    if ("PageContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageContaDetalheResponse>(){}.getType();
    }
    
    if ("PageContaHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageContaHistoricoPagamentoResponse>(){}.getType();
    }
    
    if ("PageContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageContaResponse>(){}.getType();
    }
    
    if ("PageControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageControleVencimentoResponse>(){}.getType();
    }
    
    if ("PageDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageDispositivoResponse>(){}.getType();
    }
    
    if ("PageEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageEnderecoResponse>(){}.getType();
    }
    
    if ("PageEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageEstabelecimentoResponse>(){}.getType();
    }
    
    if ("PageEstagioCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageEstagioCartaoResponse>(){}.getType();
    }
    
    if ("PageFantasiaBasicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFantasiaBasicaResponse>(){}.getType();
    }
    
    if ("PageFaqResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaqResponse>(){}.getType();
    }
    
    if ("PageFaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturaConsignadaResponse>(){}.getType();
    }
    
    if ("PageFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturaResponse>(){}.getType();
    }
    
    if ("PageHistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoAssessoriaResponse>(){}.getType();
    }
    
    if ("PageHistoricoAtrasoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoAtrasoFaturaResponse>(){}.getType();
    }
    
    if ("PageHistoricoEventosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoEventosResponse>(){}.getType();
    }
    
    if ("PageJobResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageJobResponse>(){}.getType();
    }
    
    if ("PageLoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageLoteCartoesPrePagosResponse>(){}.getType();
    }
    
    if ("PageOperadoraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageOperadoraResponse>(){}.getType();
    }
    
    if ("PageOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("PageOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageOportunidadeResponse>(){}.getType();
    }
    
    if ("PageOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageOrigemComercialResponse>(){}.getType();
    }
    
    if ("PagePaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePaisResponse>(){}.getType();
    }
    
    if ("PagePessoaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePessoaDetalheResponse>(){}.getType();
    }
    
    if ("PagePessoaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePessoaResponse>(){}.getType();
    }
    
    if ("PagePlanoParcelamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePlanoParcelamentoResponse>(){}.getType();
    }
    
    if ("PagePlataformaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePlataformaMobileResponse>(){}.getType();
    }
    
    if ("PagePortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePortadorResponse>(){}.getType();
    }
    
    if ("PageProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageProdutoResponse>(){}.getType();
    }
    
    if ("PagePromotorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePromotorResponse>(){}.getType();
    }
    
    if ("PagePushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePushResponse>(){}.getType();
    }
    
    if ("PageRiscoFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageRiscoFraudeResponse>(){}.getType();
    }
    
    if ("PageSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageSMSResponse>(){}.getType();
    }
    
    if ("PageStatusCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusCartaoResponse>(){}.getType();
    }
    
    if ("PageStatusContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusContaResponse>(){}.getType();
    }
    
    if ("PageStatusImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusImpressaoResponse>(){}.getType();
    }
    
    if ("PageStatusOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("PageStatusOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusOportunidadeResponse>(){}.getType();
    }
    
    if ("PageTaxasRefinanciamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTaxasRefinanciamentoResponse>(){}.getType();
    }
    
    if ("PageTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTelefoneResponse>(){}.getType();
    }
    
    if ("PageTemplateNotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTemplateNotificacaoResponse>(){}.getType();
    }
    
    if ("PageTerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTerminalResponse>(){}.getType();
    }
    
    if ("PageTipoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoAjusteResponse>(){}.getType();
    }
    
    if ("PageTipoBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoBoletoResponse>(){}.getType();
    }
    
    if ("PageTipoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoEnderecoResponse>(){}.getType();
    }
    
    if ("PageTipoOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("PageTipoOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoOportunidadeResponse>(){}.getType();
    }
    
    if ("PageTipoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoTelefoneResponse>(){}.getType();
    }
    
    if ("PageTransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacaoNaoProcessadaResponse>(){}.getType();
    }
    
    if ("PageTransacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacaoResponse>(){}.getType();
    }
    
    if ("PageTransacoesCorrentesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacoesCorrentesResponse>(){}.getType();
    }
    
    if ("PageTransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransferenciaBancariaResponse>(){}.getType();
    }
    
    if ("PageTransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransferenciaResponse>(){}.getType();
    }
    
    if ("PageUsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageUsuarioResponse>(){}.getType();
    }
    
    if ("PageWebHookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageWebHookResponse>(){}.getType();
    }
    
    if ("PaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PaisResponse>(){}.getType();
    }
    
    if ("ParametroProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroProdutoResponse>(){}.getType();
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
    
    if ("PessoaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaResponse>(){}.getType();
    }
    
    if ("PlanoParcelamentoEmprestimoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoParcelamentoEmprestimoResponse>(){}.getType();
    }
    
    if ("PlanoParcelamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoParcelamentoResponse>(){}.getType();
    }
    
    if ("PlataformaMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobilePersist>(){}.getType();
    }
    
    if ("PlataformaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobileResponse>(){}.getType();
    }
    
    if ("PlataformaMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobileUpdate>(){}.getType();
    }
    
    if ("PortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PortadorResponse>(){}.getType();
    }
    
    if ("ProdutoDetalhesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProdutoDetalhesResponse>(){}.getType();
    }
    
    if ("ProdutoOrigemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProdutoOrigemResponse>(){}.getType();
    }
    
    if ("ProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProdutoResponse>(){}.getType();
    }
    
    if ("PromotorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PromotorResponse>(){}.getType();
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
    
    if ("SocioAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SocioAprovadoResponse>(){}.getType();
    }
    
    if ("StatusCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusCartaoResponse>(){}.getType();
    }
    
    if ("StatusContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusContaResponse>(){}.getType();
    }
    
    if ("StatusImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusImpressaoResponse>(){}.getType();
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
    
    if ("TaxasRefinanciamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TaxasRefinanciamentoResponse>(){}.getType();
    }
    
    if ("TelefoneAdicionalPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneAdicionalPersist>(){}.getType();
    }
    
    if ("TelefoneAdicionalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneAdicionalUpdate>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TelefonePessoaAprovadaPersist>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TelefonePessoaAprovadaResponse>(){}.getType();
    }
    
    if ("TelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneResponse>(){}.getType();
    }
    
    if ("TemplateNotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TemplateNotificacaoResponse>(){}.getType();
    }
    
    if ("TerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TerminalResponse>(){}.getType();
    }
    
    if ("TipoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoAjusteResponse>(){}.getType();
    }
    
    if ("TipoBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoBoletoResponse>(){}.getType();
    }
    
    if ("TipoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoEnderecoResponse>(){}.getType();
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
    
    if ("TipoResolucaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoResolucaoResponse>(){}.getType();
    }
    
    if ("TipoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTelefoneResponse>(){}.getType();
    }
    
    if ("TokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TokenResponse>(){}.getType();
    }
    
    if ("TransacaoCorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoCorrenteResponse>(){}.getType();
    }
    
    if ("TransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoNaoProcessadaResponse>(){}.getType();
    }
    
    if ("TransacaoOnUsPorIdCartaoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoOnUsPorIdCartaoRequest>(){}.getType();
    }
    
    if ("TransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoOnUsRequest>(){}.getType();
    }
    
    if ("TransacaoOnUsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoOnUsResponse>(){}.getType();
    }
    
    if ("TransacoesCorrentesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacoesCorrentesResponse>(){}.getType();
    }
    
    if ("TransferenciaBancariaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaBancariaPersist>(){}.getType();
    }
    
    if ("TransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaBancariaResponse>(){}.getType();
    }
    
    if ("TransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaResponse>(){}.getType();
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
    
    if ("ValidaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ValidaCartaoResponse>(){}.getType();
    }
    
    if ("ValidaSenhaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ValidaSenhaCartaoResponse>(){}.getType();
    }
    
    if ("WebHookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WebHookResponse>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
