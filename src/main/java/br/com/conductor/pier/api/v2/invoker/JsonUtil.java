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
    
    if ("APNSubscription".equalsIgnoreCase(className)) {
      return new TypeToken<List<APNSubscription>>(){}.getType();
    }
    
    if ("AcordoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AcordoDetalheResponse>>(){}.getType();
    }
    
    if ("AcordoQuebraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AcordoQuebraResponse>>(){}.getType();
    }
    
    if ("AcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AcordoResponse>>(){}.getType();
    }
    
    if ("AdesaoPacoteTarifaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdesaoPacoteTarifaPersist>>(){}.getType();
    }
    
    if ("AdesaoPacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdesaoPacoteTarifaResponse>>(){}.getType();
    }
    
    if ("AdesaoPagamentoSabadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdesaoPagamentoSabadoResponse>>(){}.getType();
    }
    
    if ("AdesaoServicoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdesaoServicoPersist>>(){}.getType();
    }
    
    if ("AdesaoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdesaoServicoResponse>>(){}.getType();
    }
    
    if ("AdicionalContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdicionalContaPersist>>(){}.getType();
    }
    
    if ("AdicionalContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdicionalContaResponse>>(){}.getType();
    }
    
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
    
    if ("AjusteFinanceiroResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AjusteFinanceiroResponse>>(){}.getType();
    }
    
    if ("AlterarProdutoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AlterarProdutoRequest>>(){}.getType();
    }
    
    if ("AnexoNotificacaoEmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AnexoNotificacaoEmailRequest>>(){}.getType();
    }
    
    if ("AntecipacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AntecipacaoResponse>>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaDetalhesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AntecipacaoSimuladaDetalhesResponse>>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaLoteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AntecipacaoSimuladaLoteResponse>>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AntecipacaoSimuladaResponse>>(){}.getType();
    }
    
    if ("AnuidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AnuidadeResponse>>(){}.getType();
    }
    
    if ("AplicacaoMobileEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobileEmissorResponse>>(){}.getType();
    }
    
    if ("AplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobileResponse>>(){}.getType();
    }
    
    if ("ApplicationMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApplicationMobilePersist>>(){}.getType();
    }
    
    if ("ApplicationMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApplicationMobileUpdate>>(){}.getType();
    }
    
    if ("ArquivoAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArquivoAUDResponse>>(){}.getType();
    }
    
    if ("ArquivoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArquivoDetalheResponse>>(){}.getType();
    }
    
    if ("ArquivoDetalhesPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArquivoDetalhesPersist>>(){}.getType();
    }
    
    if ("ArquivoParametroAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArquivoParametroAUDResponse>>(){}.getType();
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
    
    if ("AutorizacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AutorizacaoOnUsRequest>>(){}.getType();
    }
    
    if ("AvisoViagemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AvisoViagemResponse>>(){}.getType();
    }
    
    if ("BancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BancoResponse>>(){}.getType();
    }
    
    if ("BankAccountCardholderUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<BankAccountCardholderUpdate>>(){}.getType();
    }
    
    if ("BankaccountCardholderPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<BankaccountCardholderPersist>>(){}.getType();
    }
    
    if ("BeneficioPagamentoAtrasoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BeneficioPagamentoAtrasoResponse>>(){}.getType();
    }
    
    if ("BinResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BinResponse>>(){}.getType();
    }
    
    if ("BoletoEmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoletoEmailRequest>>(){}.getType();
    }
    
    if ("BoletoListarResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoletoListarResponse>>(){}.getType();
    }
    
    if ("BoletoParcelaAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoletoParcelaAcordoResponse>>(){}.getType();
    }
    
    if ("BoletoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoletoRequest>>(){}.getType();
    }
    
    if ("BoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoletoResponse>>(){}.getType();
    }
    
    if ("CampaignUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<CampaignUpdate>>(){}.getType();
    }
    
    if ("CampanhaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CampanhaPersist>>(){}.getType();
    }
    
    if ("CampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CampanhaResponse>>(){}.getType();
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
    
    if ("CardMultiAppPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CardMultiAppPersist>>(){}.getType();
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
    
    if ("CartaoEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoEmissorResponse>>(){}.getType();
    }
    
    if ("CartaoImpressaoProvisorioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoImpressaoProvisorioResponse>>(){}.getType();
    }
    
    if ("CartaoImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoImpressaoResponse>>(){}.getType();
    }
    
    if ("CartaoMultiAppImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoMultiAppImpressaoResponse>>(){}.getType();
    }
    
    if ("CartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoResponse>>(){}.getType();
    }
    
    if ("CdtDetalheOportunidadeAUD".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtDetalheOportunidadeAUD>>(){}.getType();
    }
    
    if ("CdtDocumentoCredito".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtDocumentoCredito>>(){}.getType();
    }
    
    if ("CdtDocumentoProposta".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtDocumentoProposta>>(){}.getType();
    }
    
    if ("CdtTipoContaBancaria".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtTipoContaBancaria>>(){}.getType();
    }
    
    if ("CdtTipoResolucaoContestacao".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtTipoResolucaoContestacao>>(){}.getType();
    }
    
    if ("CelularRecargaProgramadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CelularRecargaProgramadaPersist>>(){}.getType();
    }
    
    if ("CelularRecargaProgramadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CelularRecargaProgramadaResponse>>(){}.getType();
    }
    
    if ("ChaveCriptografiaRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChaveCriptografiaRequest>>(){}.getType();
    }
    
    if ("ChaveCriptografiaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChaveCriptografiaResponse>>(){}.getType();
    }
    
    if ("CodigoChargebackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CodigoChargebackResponse>>(){}.getType();
    }
    
    if ("CodigoSegurancaEMAILPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CodigoSegurancaEMAILPersist>>(){}.getType();
    }
    
    if ("CodigoSegurancaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CodigoSegurancaResponse>>(){}.getType();
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
    
    if ("ConfiguracaoRegistroCobrancaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoRegistroCobrancaPersist>>(){}.getType();
    }
    
    if ("ConfiguracaoRegistroCobrancaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoRegistroCobrancaResponse>>(){}.getType();
    }
    
    if ("ConfiguracaoRotativoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoRotativoDetalheResponse>>(){}.getType();
    }
    
    if ("ConfiguracaoRotativoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoRotativoPersist>>(){}.getType();
    }
    
    if ("ConsultaCadastroEstabelecimentoDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultaCadastroEstabelecimentoDTO>>(){}.getType();
    }
    
    if ("ContaBancariaPortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaBancariaPortadorResponse>>(){}.getType();
    }
    
    if ("ContaDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDebitoRecorrenteResponse>>(){}.getType();
    }
    
    if ("ContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDetalheResponse>>(){}.getType();
    }
    
    if ("ContaHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaHistoricoPagamentoResponse>>(){}.getType();
    }
    
    if ("ContaMultiAppResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaMultiAppResponse>>(){}.getType();
    }
    
    if ("ContaPartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaPartialUpdate>>(){}.getType();
    }
    
    if ("ContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaPersist>>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaResponse>>(){}.getType();
    }
    
    if ("ControleSegurancaDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleSegurancaDispositivoResponse>>(){}.getType();
    }
    
    if ("ControleTentativaCadastroResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleTentativaCadastroResponse>>(){}.getType();
    }
    
    if ("ControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleVencimentoResponse>>(){}.getType();
    }
    
    if ("ConvenioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConvenioPersist>>(){}.getType();
    }
    
    if ("ConvenioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConvenioResponse>>(){}.getType();
    }
    
    if ("CountMultiAppPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CountMultiAppPersist>>(){}.getType();
    }
    
    if ("CredorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CredorPersist>>(){}.getType();
    }
    
    if ("CredorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CredorResponse>>(){}.getType();
    }
    
    if ("CredorUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<CredorUpdate>>(){}.getType();
    }
    
    if ("DadosBancariosContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosBancariosContaPersist>>(){}.getType();
    }
    
    if ("DadosBancariosContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosBancariosContaResponse>>(){}.getType();
    }
    
    if ("DadosBancariosContaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosBancariosContaUpdate>>(){}.getType();
    }
    
    if ("DadosCartaoImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosCartaoImpressaoResponse>>(){}.getType();
    }
    
    if ("DadosCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosCartaoResponse>>(){}.getType();
    }
    
    if ("DadosPortadorRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosPortadorRequest>>(){}.getType();
    }
    
    if ("DebitAccountRecurrent".equalsIgnoreCase(className)) {
      return new TypeToken<List<DebitAccountRecurrent>>(){}.getType();
    }
    
    if ("DesfazimentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<DesfazimentoTransacaoOnUsRequest>>(){}.getType();
    }
    
    if ("DetailOpportunityPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetailOpportunityPersist>>(){}.getType();
    }
    
    if ("DetailOpportunityUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetailOpportunityUpdate>>(){}.getType();
    }
    
    if ("DetalheOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalheOperacaoResponse>>(){}.getType();
    }
    
    if ("DetalheOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalheOportunidadeResponse>>(){}.getType();
    }
    
    if ("DetalhesFaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalhesFaturaConsignadaResponse>>(){}.getType();
    }
    
    if ("DetalhesFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalhesFaturaResponse>>(){}.getType();
    }
    
    if ("DevicePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<DevicePersist>>(){}.getType();
    }
    
    if ("DispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DispositivoResponse>>(){}.getType();
    }
    
    if ("DividaClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DividaClienteResponse>>(){}.getType();
    }
    
    if ("DocumentoDetalhadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoDetalhadoResponse>>(){}.getType();
    }
    
    if ("DocumentoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoDetalheResponse>>(){}.getType();
    }
    
    if ("DocumentoIntegracaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoIntegracaoResponse>>(){}.getType();
    }
    
    if ("DocumentoParametrosRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoParametrosRequest>>(){}.getType();
    }
    
    if ("DocumentoPropostaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoPropostaPersist>>(){}.getType();
    }
    
    if ("DocumentoPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoPropostaResponse>>(){}.getType();
    }
    
    if ("DocumentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoResponse>>(){}.getType();
    }
    
    if ("DocumentoTemplatePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoTemplatePersist>>(){}.getType();
    }
    
    if ("DocumentoTemplateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoTemplateResponse>>(){}.getType();
    }
    
    if ("EmprestimoPessoalRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EmprestimoPessoalRequest>>(){}.getType();
    }
    
    if ("EmprestimoPessoalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EmprestimoPessoalResponse>>(){}.getType();
    }
    
    if ("EnderecoNacionalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoNacionalResponse>>(){}.getType();
    }
    
    if ("EnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoResponse>>(){}.getType();
    }
    
    if ("EntidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EntidadeResponse>>(){}.getType();
    }
    
    if ("EstabelecimentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstabelecimentoPersist>>(){}.getType();
    }
    
    if ("EstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstabelecimentoResponse>>(){}.getType();
    }
    
    if ("EstabelecimentoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstabelecimentoUpdate>>(){}.getType();
    }
    
    if ("EstagioCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstagioCartaoResponse>>(){}.getType();
    }
    
    if ("EstagioCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<EstagioCartaoUpdate>>(){}.getType();
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
    
    if ("FaturaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaDetalheResponse>>(){}.getType();
    }
    
    if ("FaturaFechadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaFechadaResponse>>(){}.getType();
    }
    
    if ("FaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaResponse>>(){}.getType();
    }
    
    if ("GradePendenteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<GradePendenteRequest>>(){}.getType();
    }
    
    if ("GrupoChargebackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoChargebackResponse>>(){}.getType();
    }
    
    if ("GrupoEconomicoDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoEconomicoDTO>>(){}.getType();
    }
    
    if ("GrupoEconomicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoEconomicoResponse>>(){}.getType();
    }
    
    if ("GrupoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoOrigemComercialResponse>>(){}.getType();
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
    
    if ("HistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoPagamentoResponse>>(){}.getType();
    }
    
    if ("HistoricoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoTelefoneResponse>>(){}.getType();
    }
    
    if ("InscricaoAPNResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<InscricaoAPNResponse>>(){}.getType();
    }
    
    if ("IntegracaoEmissorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<IntegracaoEmissorPersist>>(){}.getType();
    }
    
    if ("IntegracaoEmissorPropostaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<IntegracaoEmissorPropostaPersist>>(){}.getType();
    }
    
    if ("IntegracaoEmissorPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<IntegracaoEmissorPropostaResponse>>(){}.getType();
    }
    
    if ("IntegracaoEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<IntegracaoEmissorResponse>>(){}.getType();
    }
    
    if ("IntegrarArquivoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<IntegrarArquivoRequest>>(){}.getType();
    }
    
    if ("IntegrarDocumentoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<IntegrarDocumentoRequest>>(){}.getType();
    }
    
    if ("LancamentoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LancamentoFaturaResponse>>(){}.getType();
    }
    
    if ("LimiteDisponibilidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimiteDisponibilidadeResponse>>(){}.getType();
    }
    
    if ("LogAcessoUsuario".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogAcessoUsuario>>(){}.getType();
    }
    
    if ("LogAcessoUsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogAcessoUsuarioResponse>>(){}.getType();
    }
    
    if ("LoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoteCartoesPrePagosResponse>>(){}.getType();
    }
    
    if ("MCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MCCResponse>>(){}.getType();
    }
    
    if ("MapOfstringAndstring".equalsIgnoreCase(className)) {
      return new TypeToken<List<MapOfstringAndstring>>(){}.getType();
    }
    
    if ("MaquinetaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<MaquinetaPersist>>(){}.getType();
    }
    
    if ("MaquinetaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MaquinetaResponse>>(){}.getType();
    }
    
    if ("MaquinetaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<MaquinetaUpdate>>(){}.getType();
    }
    
    if ("MoedaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MoedaResponse>>(){}.getType();
    }
    
    if ("NotificacaoEmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoEmailRequest>>(){}.getType();
    }
    
    if ("NotificacaoPushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoPushResponse>>(){}.getType();
    }
    
    if ("NotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoResponse>>(){}.getType();
    }
    
    if ("NotificacaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoSMSResponse>>(){}.getType();
    }
    
    if ("NotificationSMSBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificationSMSBody>>(){}.getType();
    }
    
    if ("ObjectAddressApproved".equalsIgnoreCase(className)) {
      return new TypeToken<List<ObjectAddressApproved>>(){}.getType();
    }
    
    if ("ObjectApprovedIndividual".equalsIgnoreCase(className)) {
      return new TypeToken<List<ObjectApprovedIndividual>>(){}.getType();
    }
    
    if ("OperacaoCredorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperacaoCredorPersist>>(){}.getType();
    }
    
    if ("OperacaoCredorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperacaoCredorResponse>>(){}.getType();
    }
    
    if ("OperacaoCredorUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperacaoCredorUpdate>>(){}.getType();
    }
    
    if ("OperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperacaoResponse>>(){}.getType();
    }
    
    if ("OperadoraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperadoraResponse>>(){}.getType();
    }
    
    if ("OportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("OportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadeResponse>>(){}.getType();
    }
    
    if ("OpportunityPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<OpportunityPersist>>(){}.getType();
    }
    
    if ("OpportunityUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<OpportunityUpdate>>(){}.getType();
    }
    
    if ("OrigemComercialPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrigemComercialPersist>>(){}.getType();
    }
    
    if ("OrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrigemComercialResponse>>(){}.getType();
    }
    
    if ("OrigemComercialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrigemComercialUpdate>>(){}.getType();
    }
    
    if ("PacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PacoteTarifaResponse>>(){}.getType();
    }
    
    if ("PageAcordoParcelaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAcordoParcelaResponse>>(){}.getType();
    }
    
    if ("PageAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAcordoResponse>>(){}.getType();
    }
    
    if ("PageAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAjusteResponse>>(){}.getType();
    }
    
    if ("PageAnuidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAnuidadeResponse>>(){}.getType();
    }
    
    if ("PageAplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAplicacaoMobileResponse>>(){}.getType();
    }
    
    if ("PageArquivoAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageArquivoAUDResponse>>(){}.getType();
    }
    
    if ("PageArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageArquivoResponse>>(){}.getType();
    }
    
    if ("PageAtendimentoClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAtendimentoClienteResponse>>(){}.getType();
    }
    
    if ("PageAvisoViagemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageAvisoViagemResponse>>(){}.getType();
    }
    
    if ("PageBancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageBancoResponse>>(){}.getType();
    }
    
    if ("PageBinResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageBinResponse>>(){}.getType();
    }
    
    if ("PageBoletoListarResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageBoletoListarResponse>>(){}.getType();
    }
    
    if ("PageCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCampanhaResponse>>(){}.getType();
    }
    
    if ("PageCampoCodificadoDescricaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCampoCodificadoDescricaoResponse>>(){}.getType();
    }
    
    if ("PageCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCartaoResponse>>(){}.getType();
    }
    
    if ("PageCodigoChargebackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCodigoChargebackResponse>>(){}.getType();
    }
    
    if ("PageCodigoSegurancaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCodigoSegurancaResponse>>(){}.getType();
    }
    
    if ("PageCompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCompraResponse>>(){}.getType();
    }
    
    if ("PageConfiguracaoEmailResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConfiguracaoEmailResponse>>(){}.getType();
    }
    
    if ("PageConfiguracaoRotativoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConfiguracaoRotativoResponse>>(){}.getType();
    }
    
    if ("PageContaBancariaPortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContaBancariaPortadorResponse>>(){}.getType();
    }
    
    if ("PageContaDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContaDebitoRecorrenteResponse>>(){}.getType();
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
    
    if ("PageControleSegurancaDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageControleSegurancaDispositivoResponse>>(){}.getType();
    }
    
    if ("PageControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageControleVencimentoResponse>>(){}.getType();
    }
    
    if ("PageConvenioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConvenioResponse>>(){}.getType();
    }
    
    if ("PageDadosBancariosContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageDadosBancariosContaResponse>>(){}.getType();
    }
    
    if ("PageDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageDispositivoResponse>>(){}.getType();
    }
    
    if ("PageDocumentoCreditoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageDocumentoCreditoResponse>>(){}.getType();
    }
    
    if ("PageDocumentoPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageDocumentoPropostaResponse>>(){}.getType();
    }
    
    if ("PageDocumentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageDocumentoResponse>>(){}.getType();
    }
    
    if ("PageDocumentoTemplateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageDocumentoTemplateResponse>>(){}.getType();
    }
    
    if ("PageEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEnderecoResponse>>(){}.getType();
    }
    
    if ("PageEntidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageEntidadeResponse>>(){}.getType();
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
    
    if ("PageFaturaFechadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturaFechadaResponse>>(){}.getType();
    }
    
    if ("PageFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturaResponse>>(){}.getType();
    }
    
    if ("PageGrupoChargebackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageGrupoChargebackResponse>>(){}.getType();
    }
    
    if ("PageGrupoEconomicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageGrupoEconomicoResponse>>(){}.getType();
    }
    
    if ("PageGrupoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageGrupoOrigemComercialResponse>>(){}.getType();
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
    
    if ("PageHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoPagamentoResponse>>(){}.getType();
    }
    
    if ("PageInscricaoAPNResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageInscricaoAPNResponse>>(){}.getType();
    }
    
    if ("PageLoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageLoteCartoesPrePagosResponse>>(){}.getType();
    }
    
    if ("PageMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageMCCResponse>>(){}.getType();
    }
    
    if ("PageMaquinetaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageMaquinetaResponse>>(){}.getType();
    }
    
    if ("PageMoedaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageMoedaResponse>>(){}.getType();
    }
    
    if ("PageOperacaoCredorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOperacaoCredorResponse>>(){}.getType();
    }
    
    if ("PageOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOperacaoResponse>>(){}.getType();
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
    
    if ("PageParametroProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageParametroProdutoResponse>>(){}.getType();
    }
    
    if ("PagePessoaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePessoaDetalheResponse>>(){}.getType();
    }
    
    if ("PagePessoaJuridicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePessoaJuridicaResponse>>(){}.getType();
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
    
    if ("PageProdutoPacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageProdutoPacoteTarifaResponse>>(){}.getType();
    }
    
    if ("PageProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageProdutoResponse>>(){}.getType();
    }
    
    if ("PagePromotorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePromotorResponse>>(){}.getType();
    }
    
    if ("PagePropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePropostaResponse>>(){}.getType();
    }
    
    if ("PagePushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePushResponse>>(){}.getType();
    }
    
    if ("PageRelatorioMovimentosControleProcessos".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageRelatorioMovimentosControleProcessos>>(){}.getType();
    }
    
    if ("PageRiskFraudResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageRiskFraudResponse>>(){}.getType();
    }
    
    if ("PageSMSEnvioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSMSEnvioResponse>>(){}.getType();
    }
    
    if ("PageSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSMSResponse>>(){}.getType();
    }
    
    if ("PageServicoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageServicoContaResponse>>(){}.getType();
    }
    
    if ("PageStatusArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusArquivoResponse>>(){}.getType();
    }
    
    if ("PageStatusBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusBoletoResponse>>(){}.getType();
    }
    
    if ("PageStatusCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusCartaoResponse>>(){}.getType();
    }
    
    if ("PageStatusContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusContaResponse>>(){}.getType();
    }
    
    if ("PageStatusContestacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusContestacaoResponse>>(){}.getType();
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
    
    if ("PageStatusPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusPropostaResponse>>(){}.getType();
    }
    
    if ("PageTaxasRefinanciamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTaxasRefinanciamentoResponse>>(){}.getType();
    }
    
    if ("PageTelefoneEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTelefoneEstabelecimentoResponse>>(){}.getType();
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
    
    if ("PageTipoArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoArquivoResponse>>(){}.getType();
    }
    
    if ("PageTipoBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoBoletoResponse>>(){}.getType();
    }
    
    if ("PageTipoCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoCampanhaResponse>>(){}.getType();
    }
    
    if ("PageTipoChaveResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoChaveResponse>>(){}.getType();
    }
    
    if ("PageTipoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoContaBancariaResponse>>(){}.getType();
    }
    
    if ("PageTipoDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoDebitoRecorrenteResponse>>(){}.getType();
    }
    
    if ("PageTipoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoEnderecoResponse>>(){}.getType();
    }
    
    if ("PageTipoEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoEstabelecimentoResponse>>(){}.getType();
    }
    
    if ("PageTipoFaturamentoPorContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoFaturamentoPorContaResponse>>(){}.getType();
    }
    
    if ("PageTipoFaturamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoFaturamentoResponse>>(){}.getType();
    }
    
    if ("PageTipoOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("PageTipoOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoOportunidadeResponse>>(){}.getType();
    }
    
    if ("PageTipoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoOrigemComercialResponse>>(){}.getType();
    }
    
    if ("PageTipoResolucaoContestacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoResolucaoContestacaoResponse>>(){}.getType();
    }
    
    if ("PageTipoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoServicoResponse>>(){}.getType();
    }
    
    if ("PageTipoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoTelefoneResponse>>(){}.getType();
    }
    
    if ("PageTipoTemplateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoTemplateResponse>>(){}.getType();
    }
    
    if ("PageTipoTerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoTerminalResponse>>(){}.getType();
    }
    
    if ("PageTransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacaoNaoProcessadaResponse>>(){}.getType();
    }
    
    if ("PageTransacaoProcessadaNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacaoProcessadaNaoProcessadaResponse>>(){}.getType();
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
    
    if ("PageTransferenciaCreditoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransferenciaCreditoContaBancariaResponse>>(){}.getType();
    }
    
    if ("PageTransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransferenciaResponse>>(){}.getType();
    }
    
    if ("PageUsuarioContasResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageUsuarioContasResponse>>(){}.getType();
    }
    
    if ("PageUsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageUsuarioResponse>>(){}.getType();
    }
    
    if ("PageUsuarioTokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageUsuarioTokenResponse>>(){}.getType();
    }
    
    if ("PageVinculoEstabelecimentoAdquirenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageVinculoEstabelecimentoAdquirenteResponse>>(){}.getType();
    }
    
    if ("PageVinculoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageVinculoOperacaoResponse>>(){}.getType();
    }
    
    if ("PageWebHookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageWebHookResponse>>(){}.getType();
    }
    
    if ("PaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaisResponse>>(){}.getType();
    }
    
    if ("ParametroEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroEmissorResponse>>(){}.getType();
    }
    
    if ("ParametroProdutoPartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroProdutoPartialUpdate>>(){}.getType();
    }
    
    if ("ParametroProdutoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroProdutoPersist>>(){}.getType();
    }
    
    if ("ParametroProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroProdutoResponse>>(){}.getType();
    }
    
    if ("ParametrosProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametrosProdutoResponse>>(){}.getType();
    }
    
    if ("ParcelaAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParcelaAcordoResponse>>(){}.getType();
    }
    
    if ("ParcelamentoTransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParcelamentoTransferenciaResponse>>(){}.getType();
    }
    
    if ("PaymentAgreementAgreement".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentAgreementAgreement>>(){}.getType();
    }
    
    if ("PersonPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PersonPersist>>(){}.getType();
    }
    
    if ("PessoaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaDetalheResponse>>(){}.getType();
    }
    
    if ("PessoaJuridicaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaJuridicaAprovadaPersist>>(){}.getType();
    }
    
    if ("PessoaJuridicaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaJuridicaAprovadaResponse>>(){}.getType();
    }
    
    if ("PessoaJuridicaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaJuridicaPersist>>(){}.getType();
    }
    
    if ("PessoaJuridicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaJuridicaResponse>>(){}.getType();
    }
    
    if ("PessoaJuridicaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaJuridicaUpdate>>(){}.getType();
    }
    
    if ("PessoaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaResponse>>(){}.getType();
    }
    
    if ("PlanCampaignUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanCampaignUpdate>>(){}.getType();
    }
    
    if ("PlanInstallmentAgreementRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanInstallmentAgreementRequest>>(){}.getType();
    }
    
    if ("PlanInstallmentAgreementResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanInstallmentAgreementResponse>>(){}.getType();
    }
    
    if ("PlanoCampanhaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoCampanhaPersist>>(){}.getType();
    }
    
    if ("PlanoCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoCampanhaResponse>>(){}.getType();
    }
    
    if ("PlanoParcelamentoEmprestimoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoParcelamentoEmprestimoResponse>>(){}.getType();
    }
    
    if ("PlanoParcelamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoParcelamentoResponse>>(){}.getType();
    }
    
    if ("PlanoParcelamentoTransferenciaCreditoContaBancariaRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoParcelamentoTransferenciaCreditoContaBancariaRequest>>(){}.getType();
    }
    
    if ("PlanoParcelamentoTransferenciaCreditoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoParcelamentoTransferenciaCreditoContaBancariaResponse>>(){}.getType();
    }
    
    if ("PlataformaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobileResponse>>(){}.getType();
    }
    
    if ("PlatformMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlatformMobilePersist>>(){}.getType();
    }
    
    if ("PlatformMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlatformMobileUpdate>>(){}.getType();
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
    
    if ("ProdutoPacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProdutoPacoteTarifaResponse>>(){}.getType();
    }
    
    if ("ProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProdutoResponse>>(){}.getType();
    }
    
    if ("PromotorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PromotorResponse>>(){}.getType();
    }
    
    if ("PropostaParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PropostaParcialUpdate>>(){}.getType();
    }
    
    if ("PropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PropostaResponse>>(){}.getType();
    }
    
    if ("PropriedadeDocumentoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PropriedadeDocumentoRequest>>(){}.getType();
    }
    
    if ("PushAPNS".equalsIgnoreCase(className)) {
      return new TypeToken<List<PushAPNS>>(){}.getType();
    }
    
    if ("PushFCMAndGCM".equalsIgnoreCase(className)) {
      return new TypeToken<List<PushFCMAndGCM>>(){}.getType();
    }
    
    if ("RefenceCommercialApprovedPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<RefenceCommercialApprovedPersist>>(){}.getType();
    }
    
    if ("ReferenciaComercialAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReferenciaComercialAprovadoResponse>>(){}.getType();
    }
    
    if ("ReferenciaIdPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReferenciaIdPersist>>(){}.getType();
    }
    
    if ("RelatorioMovimentosControleProcessosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RelatorioMovimentosControleProcessosResponse>>(){}.getType();
    }
    
    if ("RepresentationOfTheResourceEntryOfRegisteringAServiceAccount".equalsIgnoreCase(className)) {
      return new TypeToken<List<RepresentationOfTheResourceEntryOfRegisteringAServiceAccount>>(){}.getType();
    }
    
    if ("RiscoFraudeDetalhadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiscoFraudeDetalhadoResponse>>(){}.getType();
    }
    
    if ("RiskFraudResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiskFraudResponse>>(){}.getType();
    }
    
    if ("SMSEnvioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SMSEnvioResponse>>(){}.getType();
    }
    
    if ("Secure3dRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<Secure3dRequest>>(){}.getType();
    }
    
    if ("SensibilizarSaldoGlobalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<SensibilizarSaldoGlobalUpdate>>(){}.getType();
    }
    
    if ("ServicoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ServicoContaResponse>>(){}.getType();
    }
    
    if ("SocioAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SocioAprovadoResponse>>(){}.getType();
    }
    
    if ("StatusArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusArquivoResponse>>(){}.getType();
    }
    
    if ("StatusBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusBoletoResponse>>(){}.getType();
    }
    
    if ("StatusCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusCartaoResponse>>(){}.getType();
    }
    
    if ("StatusContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusContaResponse>>(){}.getType();
    }
    
    if ("StatusContestacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusContestacaoResponse>>(){}.getType();
    }
    
    if ("StatusImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusImpressaoResponse>>(){}.getType();
    }
    
    if ("StatusOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("StatusOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOportunidadeResponse>>(){}.getType();
    }
    
    if ("StatusOpportunity".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOpportunity>>(){}.getType();
    }
    
    if ("StatusPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusPropostaResponse>>(){}.getType();
    }
    
    if ("StatusPropostaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusPropostaUpdate>>(){}.getType();
    }
    
    if ("StrongPassword".equalsIgnoreCase(className)) {
      return new TypeToken<List<StrongPassword>>(){}.getType();
    }
    
    if ("TaxaAntecipacaoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaxaAntecipacaoRequest>>(){}.getType();
    }
    
    if ("TaxaJurosContaListaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaxaJurosContaListaResponse>>(){}.getType();
    }
    
    if ("TaxaJurosContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaxaJurosContaResponse>>(){}.getType();
    }
    
    if ("TaxaTaxaJurosConta".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaxaTaxaJurosConta>>(){}.getType();
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
    
    if ("TelefoneEscritorioCobrancaDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneEscritorioCobrancaDTO>>(){}.getType();
    }
    
    if ("TelefoneEstabelecimentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneEstabelecimentoPersist>>(){}.getType();
    }
    
    if ("TelefoneEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneEstabelecimentoResponse>>(){}.getType();
    }
    
    if ("TelefoneEstabelecimentoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneEstabelecimentoUpdate>>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefonePessoaAprovadaResponse>>(){}.getType();
    }
    
    if ("TelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneResponse>>(){}.getType();
    }
    
    if ("TelephonePersonApprovedPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelephonePersonApprovedPersist>>(){}.getType();
    }
    
    if ("TemplateNotificacaoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TemplateNotificacaoDetalheResponse>>(){}.getType();
    }
    
    if ("TemplateNotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TemplateNotificacaoResponse>>(){}.getType();
    }
    
    if ("TerminalPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TerminalPersist>>(){}.getType();
    }
    
    if ("TerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TerminalResponse>>(){}.getType();
    }
    
    if ("TerminalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TerminalUpdate>>(){}.getType();
    }
    
    if ("TipoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoAjusteResponse>>(){}.getType();
    }
    
    if ("TipoArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoArquivoResponse>>(){}.getType();
    }
    
    if ("TipoBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoBoletoResponse>>(){}.getType();
    }
    
    if ("TipoCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoCampanhaResponse>>(){}.getType();
    }
    
    if ("TipoChaveResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoChaveResponse>>(){}.getType();
    }
    
    if ("TipoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoContaBancariaResponse>>(){}.getType();
    }
    
    if ("TipoDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoDebitoRecorrenteResponse>>(){}.getType();
    }
    
    if ("TipoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoEnderecoResponse>>(){}.getType();
    }
    
    if ("TipoEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoEstabelecimentoResponse>>(){}.getType();
    }
    
    if ("TipoFaturamentoPorContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoFaturamentoPorContaResponse>>(){}.getType();
    }
    
    if ("TipoFaturamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoFaturamentoResponse>>(){}.getType();
    }
    
    if ("TipoOperacaoParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOperacaoParcialUpdate>>(){}.getType();
    }
    
    if ("TipoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOperacaoResponse>>(){}.getType();
    }
    
    if ("TipoOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("TipoOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOportunidadeResponse>>(){}.getType();
    }
    
    if ("TipoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOrigemComercialResponse>>(){}.getType();
    }
    
    if ("TipoResolucaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoResolucaoResponse>>(){}.getType();
    }
    
    if ("TipoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoServicoResponse>>(){}.getType();
    }
    
    if ("TipoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTelefoneResponse>>(){}.getType();
    }
    
    if ("TipoTemplateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTemplateRequest>>(){}.getType();
    }
    
    if ("TipoTemplateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTemplateResponse>>(){}.getType();
    }
    
    if ("TipoTerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTerminalResponse>>(){}.getType();
    }
    
    if ("TipoTransacaoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTransacaoAjusteResponse>>(){}.getType();
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
    
    if ("TransacaoProcessadaNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoProcessadaNaoProcessadaResponse>>(){}.getType();
    }
    
    if ("TransacoesCorrentesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacoesCorrentesResponse>>(){}.getType();
    }
    
    if ("TransferBankingPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferBankingPersist>>(){}.getType();
    }
    
    if ("TransferCreditBankingAccountPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferCreditBankingAccountPersist>>(){}.getType();
    }
    
    if ("TransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaBancariaResponse>>(){}.getType();
    }
    
    if ("TransferenciaCreditoContaBancariaListaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaCreditoContaBancariaListaResponse>>(){}.getType();
    }
    
    if ("TransferenciaCreditoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaCreditoContaBancariaResponse>>(){}.getType();
    }
    
    if ("TransferenciaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaDetalheResponse>>(){}.getType();
    }
    
    if ("TransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaResponse>>(){}.getType();
    }
    
    if ("TypeBillingPerAccountPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TypeBillingPerAccountPersist>>(){}.getType();
    }
    
    if ("TypeBillingPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TypeBillingPersist>>(){}.getType();
    }
    
    if ("TypeOpportunity".equalsIgnoreCase(className)) {
      return new TypeToken<List<TypeOpportunity>>(){}.getType();
    }
    
    if ("UserToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserToken>>(){}.getType();
    }
    
    if ("UserUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserUpdate>>(){}.getType();
    }
    
    if ("UsuarioContasResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioContasResponse>>(){}.getType();
    }
    
    if ("UsuarioDispositivoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioDispositivoPersist>>(){}.getType();
    }
    
    if ("UsuarioDispositivoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioDispositivoUpdate>>(){}.getType();
    }
    
    if ("UsuarioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioPersist>>(){}.getType();
    }
    
    if ("UsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioResponse>>(){}.getType();
    }
    
    if ("UsuarioTokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioTokenResponse>>(){}.getType();
    }
    
    if ("ValidaCVVRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidaCVVRequest>>(){}.getType();
    }
    
    if ("ValidaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidaCartaoResponse>>(){}.getType();
    }
    
    if ("ValidaSenhaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidaSenhaCartaoResponse>>(){}.getType();
    }
    
    if ("ValidarSenhaLoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidarSenhaLoginRequest>>(){}.getType();
    }
    
    if ("VencimentoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<VencimentoUpdate>>(){}.getType();
    }
    
    if ("VinculoCartoesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<VinculoCartoesResponse>>(){}.getType();
    }
    
    if ("VinculoEstabelecimentoAdquirentePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<VinculoEstabelecimentoAdquirentePersist>>(){}.getType();
    }
    
    if ("VinculoEstabelecimentoAdquirenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<VinculoEstabelecimentoAdquirenteResponse>>(){}.getType();
    }
    
    if ("VinculoOperacaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<VinculoOperacaoPersist>>(){}.getType();
    }
    
    if ("VinculoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<VinculoOperacaoResponse>>(){}.getType();
    }
    
    if ("WebHook".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebHook>>(){}.getType();
    }
    
    if ("WebHookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebHookResponse>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("APNSubscription".equalsIgnoreCase(className)) {
      return new TypeToken<APNSubscription>(){}.getType();
    }
    
    if ("AcordoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AcordoDetalheResponse>(){}.getType();
    }
    
    if ("AcordoQuebraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AcordoQuebraResponse>(){}.getType();
    }
    
    if ("AcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AcordoResponse>(){}.getType();
    }
    
    if ("AdesaoPacoteTarifaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<AdesaoPacoteTarifaPersist>(){}.getType();
    }
    
    if ("AdesaoPacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AdesaoPacoteTarifaResponse>(){}.getType();
    }
    
    if ("AdesaoPagamentoSabadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AdesaoPagamentoSabadoResponse>(){}.getType();
    }
    
    if ("AdesaoServicoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<AdesaoServicoPersist>(){}.getType();
    }
    
    if ("AdesaoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AdesaoServicoResponse>(){}.getType();
    }
    
    if ("AdicionalContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<AdicionalContaPersist>(){}.getType();
    }
    
    if ("AdicionalContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AdicionalContaResponse>(){}.getType();
    }
    
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
    
    if ("AjusteFinanceiroResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AjusteFinanceiroResponse>(){}.getType();
    }
    
    if ("AlterarProdutoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AlterarProdutoRequest>(){}.getType();
    }
    
    if ("AnexoNotificacaoEmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AnexoNotificacaoEmailRequest>(){}.getType();
    }
    
    if ("AntecipacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AntecipacaoResponse>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaDetalhesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AntecipacaoSimuladaDetalhesResponse>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaLoteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AntecipacaoSimuladaLoteResponse>(){}.getType();
    }
    
    if ("AntecipacaoSimuladaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AntecipacaoSimuladaResponse>(){}.getType();
    }
    
    if ("AnuidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AnuidadeResponse>(){}.getType();
    }
    
    if ("AplicacaoMobileEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobileEmissorResponse>(){}.getType();
    }
    
    if ("AplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobileResponse>(){}.getType();
    }
    
    if ("ApplicationMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<ApplicationMobilePersist>(){}.getType();
    }
    
    if ("ApplicationMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ApplicationMobileUpdate>(){}.getType();
    }
    
    if ("ArquivoAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ArquivoAUDResponse>(){}.getType();
    }
    
    if ("ArquivoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ArquivoDetalheResponse>(){}.getType();
    }
    
    if ("ArquivoDetalhesPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ArquivoDetalhesPersist>(){}.getType();
    }
    
    if ("ArquivoParametroAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ArquivoParametroAUDResponse>(){}.getType();
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
    
    if ("AutorizacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AutorizacaoOnUsRequest>(){}.getType();
    }
    
    if ("AvisoViagemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AvisoViagemResponse>(){}.getType();
    }
    
    if ("BancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BancoResponse>(){}.getType();
    }
    
    if ("BankAccountCardholderUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<BankAccountCardholderUpdate>(){}.getType();
    }
    
    if ("BankaccountCardholderPersist".equalsIgnoreCase(className)) {
      return new TypeToken<BankaccountCardholderPersist>(){}.getType();
    }
    
    if ("BeneficioPagamentoAtrasoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BeneficioPagamentoAtrasoResponse>(){}.getType();
    }
    
    if ("BinResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BinResponse>(){}.getType();
    }
    
    if ("BoletoEmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<BoletoEmailRequest>(){}.getType();
    }
    
    if ("BoletoListarResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BoletoListarResponse>(){}.getType();
    }
    
    if ("BoletoParcelaAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BoletoParcelaAcordoResponse>(){}.getType();
    }
    
    if ("BoletoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<BoletoRequest>(){}.getType();
    }
    
    if ("BoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BoletoResponse>(){}.getType();
    }
    
    if ("CampaignUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<CampaignUpdate>(){}.getType();
    }
    
    if ("CampanhaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CampanhaPersist>(){}.getType();
    }
    
    if ("CampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CampanhaResponse>(){}.getType();
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
    
    if ("CardMultiAppPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CardMultiAppPersist>(){}.getType();
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
    
    if ("CartaoEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoEmissorResponse>(){}.getType();
    }
    
    if ("CartaoImpressaoProvisorioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoImpressaoProvisorioResponse>(){}.getType();
    }
    
    if ("CartaoImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoImpressaoResponse>(){}.getType();
    }
    
    if ("CartaoMultiAppImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoMultiAppImpressaoResponse>(){}.getType();
    }
    
    if ("CartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoResponse>(){}.getType();
    }
    
    if ("CdtDetalheOportunidadeAUD".equalsIgnoreCase(className)) {
      return new TypeToken<CdtDetalheOportunidadeAUD>(){}.getType();
    }
    
    if ("CdtDocumentoCredito".equalsIgnoreCase(className)) {
      return new TypeToken<CdtDocumentoCredito>(){}.getType();
    }
    
    if ("CdtDocumentoProposta".equalsIgnoreCase(className)) {
      return new TypeToken<CdtDocumentoProposta>(){}.getType();
    }
    
    if ("CdtTipoContaBancaria".equalsIgnoreCase(className)) {
      return new TypeToken<CdtTipoContaBancaria>(){}.getType();
    }
    
    if ("CdtTipoResolucaoContestacao".equalsIgnoreCase(className)) {
      return new TypeToken<CdtTipoResolucaoContestacao>(){}.getType();
    }
    
    if ("CelularRecargaProgramadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CelularRecargaProgramadaPersist>(){}.getType();
    }
    
    if ("CelularRecargaProgramadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CelularRecargaProgramadaResponse>(){}.getType();
    }
    
    if ("ChaveCriptografiaRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ChaveCriptografiaRequest>(){}.getType();
    }
    
    if ("ChaveCriptografiaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ChaveCriptografiaResponse>(){}.getType();
    }
    
    if ("CodigoChargebackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CodigoChargebackResponse>(){}.getType();
    }
    
    if ("CodigoSegurancaEMAILPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CodigoSegurancaEMAILPersist>(){}.getType();
    }
    
    if ("CodigoSegurancaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CodigoSegurancaResponse>(){}.getType();
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
    
    if ("ConfiguracaoRegistroCobrancaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoRegistroCobrancaPersist>(){}.getType();
    }
    
    if ("ConfiguracaoRegistroCobrancaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoRegistroCobrancaResponse>(){}.getType();
    }
    
    if ("ConfiguracaoRotativoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoRotativoDetalheResponse>(){}.getType();
    }
    
    if ("ConfiguracaoRotativoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoRotativoPersist>(){}.getType();
    }
    
    if ("ConsultaCadastroEstabelecimentoDTO".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultaCadastroEstabelecimentoDTO>(){}.getType();
    }
    
    if ("ContaBancariaPortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaBancariaPortadorResponse>(){}.getType();
    }
    
    if ("ContaDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDebitoRecorrenteResponse>(){}.getType();
    }
    
    if ("ContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDetalheResponse>(){}.getType();
    }
    
    if ("ContaHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaHistoricoPagamentoResponse>(){}.getType();
    }
    
    if ("ContaMultiAppResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaMultiAppResponse>(){}.getType();
    }
    
    if ("ContaPartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ContaPartialUpdate>(){}.getType();
    }
    
    if ("ContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ContaPersist>(){}.getType();
    }
    
    if ("ContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaResponse>(){}.getType();
    }
    
    if ("ControleSegurancaDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ControleSegurancaDispositivoResponse>(){}.getType();
    }
    
    if ("ControleTentativaCadastroResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ControleTentativaCadastroResponse>(){}.getType();
    }
    
    if ("ControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ControleVencimentoResponse>(){}.getType();
    }
    
    if ("ConvenioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ConvenioPersist>(){}.getType();
    }
    
    if ("ConvenioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConvenioResponse>(){}.getType();
    }
    
    if ("CountMultiAppPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CountMultiAppPersist>(){}.getType();
    }
    
    if ("CredorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CredorPersist>(){}.getType();
    }
    
    if ("CredorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CredorResponse>(){}.getType();
    }
    
    if ("CredorUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<CredorUpdate>(){}.getType();
    }
    
    if ("DadosBancariosContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<DadosBancariosContaPersist>(){}.getType();
    }
    
    if ("DadosBancariosContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DadosBancariosContaResponse>(){}.getType();
    }
    
    if ("DadosBancariosContaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<DadosBancariosContaUpdate>(){}.getType();
    }
    
    if ("DadosCartaoImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DadosCartaoImpressaoResponse>(){}.getType();
    }
    
    if ("DadosCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DadosCartaoResponse>(){}.getType();
    }
    
    if ("DadosPortadorRequest".equalsIgnoreCase(className)) {
      return new TypeToken<DadosPortadorRequest>(){}.getType();
    }
    
    if ("DebitAccountRecurrent".equalsIgnoreCase(className)) {
      return new TypeToken<DebitAccountRecurrent>(){}.getType();
    }
    
    if ("DesfazimentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<DesfazimentoTransacaoOnUsRequest>(){}.getType();
    }
    
    if ("DetailOpportunityPersist".equalsIgnoreCase(className)) {
      return new TypeToken<DetailOpportunityPersist>(){}.getType();
    }
    
    if ("DetailOpportunityUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<DetailOpportunityUpdate>(){}.getType();
    }
    
    if ("DetalheOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalheOperacaoResponse>(){}.getType();
    }
    
    if ("DetalheOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalheOportunidadeResponse>(){}.getType();
    }
    
    if ("DetalhesFaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalhesFaturaConsignadaResponse>(){}.getType();
    }
    
    if ("DetalhesFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalhesFaturaResponse>(){}.getType();
    }
    
    if ("DevicePersist".equalsIgnoreCase(className)) {
      return new TypeToken<DevicePersist>(){}.getType();
    }
    
    if ("DispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DispositivoResponse>(){}.getType();
    }
    
    if ("DividaClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DividaClienteResponse>(){}.getType();
    }
    
    if ("DocumentoDetalhadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoDetalhadoResponse>(){}.getType();
    }
    
    if ("DocumentoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoDetalheResponse>(){}.getType();
    }
    
    if ("DocumentoIntegracaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoIntegracaoResponse>(){}.getType();
    }
    
    if ("DocumentoParametrosRequest".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoParametrosRequest>(){}.getType();
    }
    
    if ("DocumentoPropostaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoPropostaPersist>(){}.getType();
    }
    
    if ("DocumentoPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoPropostaResponse>(){}.getType();
    }
    
    if ("DocumentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoResponse>(){}.getType();
    }
    
    if ("DocumentoTemplatePersist".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoTemplatePersist>(){}.getType();
    }
    
    if ("DocumentoTemplateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoTemplateResponse>(){}.getType();
    }
    
    if ("EmprestimoPessoalRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EmprestimoPessoalRequest>(){}.getType();
    }
    
    if ("EmprestimoPessoalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EmprestimoPessoalResponse>(){}.getType();
    }
    
    if ("EnderecoNacionalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoNacionalResponse>(){}.getType();
    }
    
    if ("EnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoResponse>(){}.getType();
    }
    
    if ("EntidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EntidadeResponse>(){}.getType();
    }
    
    if ("EstabelecimentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<EstabelecimentoPersist>(){}.getType();
    }
    
    if ("EstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EstabelecimentoResponse>(){}.getType();
    }
    
    if ("EstabelecimentoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<EstabelecimentoUpdate>(){}.getType();
    }
    
    if ("EstagioCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EstagioCartaoResponse>(){}.getType();
    }
    
    if ("EstagioCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<EstagioCartaoUpdate>(){}.getType();
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
    
    if ("FaturaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaDetalheResponse>(){}.getType();
    }
    
    if ("FaturaFechadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaFechadaResponse>(){}.getType();
    }
    
    if ("FaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaResponse>(){}.getType();
    }
    
    if ("GradePendenteRequest".equalsIgnoreCase(className)) {
      return new TypeToken<GradePendenteRequest>(){}.getType();
    }
    
    if ("GrupoChargebackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoChargebackResponse>(){}.getType();
    }
    
    if ("GrupoEconomicoDTO".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoEconomicoDTO>(){}.getType();
    }
    
    if ("GrupoEconomicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoEconomicoResponse>(){}.getType();
    }
    
    if ("GrupoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoOrigemComercialResponse>(){}.getType();
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
    
    if ("HistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoPagamentoResponse>(){}.getType();
    }
    
    if ("HistoricoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoTelefoneResponse>(){}.getType();
    }
    
    if ("InscricaoAPNResponse".equalsIgnoreCase(className)) {
      return new TypeToken<InscricaoAPNResponse>(){}.getType();
    }
    
    if ("IntegracaoEmissorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<IntegracaoEmissorPersist>(){}.getType();
    }
    
    if ("IntegracaoEmissorPropostaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<IntegracaoEmissorPropostaPersist>(){}.getType();
    }
    
    if ("IntegracaoEmissorPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<IntegracaoEmissorPropostaResponse>(){}.getType();
    }
    
    if ("IntegracaoEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<IntegracaoEmissorResponse>(){}.getType();
    }
    
    if ("IntegrarArquivoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<IntegrarArquivoRequest>(){}.getType();
    }
    
    if ("IntegrarDocumentoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<IntegrarDocumentoRequest>(){}.getType();
    }
    
    if ("LancamentoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LancamentoFaturaResponse>(){}.getType();
    }
    
    if ("LimiteDisponibilidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LimiteDisponibilidadeResponse>(){}.getType();
    }
    
    if ("LogAcessoUsuario".equalsIgnoreCase(className)) {
      return new TypeToken<LogAcessoUsuario>(){}.getType();
    }
    
    if ("LogAcessoUsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LogAcessoUsuarioResponse>(){}.getType();
    }
    
    if ("LoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LoteCartoesPrePagosResponse>(){}.getType();
    }
    
    if ("MCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MCCResponse>(){}.getType();
    }
    
    if ("MapOfstringAndstring".equalsIgnoreCase(className)) {
      return new TypeToken<MapOfstringAndstring>(){}.getType();
    }
    
    if ("MaquinetaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<MaquinetaPersist>(){}.getType();
    }
    
    if ("MaquinetaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MaquinetaResponse>(){}.getType();
    }
    
    if ("MaquinetaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<MaquinetaUpdate>(){}.getType();
    }
    
    if ("MoedaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MoedaResponse>(){}.getType();
    }
    
    if ("NotificacaoEmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoEmailRequest>(){}.getType();
    }
    
    if ("NotificacaoPushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoPushResponse>(){}.getType();
    }
    
    if ("NotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoResponse>(){}.getType();
    }
    
    if ("NotificacaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoSMSResponse>(){}.getType();
    }
    
    if ("NotificationSMSBody".equalsIgnoreCase(className)) {
      return new TypeToken<NotificationSMSBody>(){}.getType();
    }
    
    if ("ObjectAddressApproved".equalsIgnoreCase(className)) {
      return new TypeToken<ObjectAddressApproved>(){}.getType();
    }
    
    if ("ObjectApprovedIndividual".equalsIgnoreCase(className)) {
      return new TypeToken<ObjectApprovedIndividual>(){}.getType();
    }
    
    if ("OperacaoCredorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<OperacaoCredorPersist>(){}.getType();
    }
    
    if ("OperacaoCredorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OperacaoCredorResponse>(){}.getType();
    }
    
    if ("OperacaoCredorUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<OperacaoCredorUpdate>(){}.getType();
    }
    
    if ("OperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OperacaoResponse>(){}.getType();
    }
    
    if ("OperadoraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OperadoraResponse>(){}.getType();
    }
    
    if ("OportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadeAUDResponse>(){}.getType();
    }
    
    if ("OportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadeResponse>(){}.getType();
    }
    
    if ("OpportunityPersist".equalsIgnoreCase(className)) {
      return new TypeToken<OpportunityPersist>(){}.getType();
    }
    
    if ("OpportunityUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<OpportunityUpdate>(){}.getType();
    }
    
    if ("OrigemComercialPersist".equalsIgnoreCase(className)) {
      return new TypeToken<OrigemComercialPersist>(){}.getType();
    }
    
    if ("OrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrigemComercialResponse>(){}.getType();
    }
    
    if ("OrigemComercialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<OrigemComercialUpdate>(){}.getType();
    }
    
    if ("PacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PacoteTarifaResponse>(){}.getType();
    }
    
    if ("PageAcordoParcelaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAcordoParcelaResponse>(){}.getType();
    }
    
    if ("PageAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAcordoResponse>(){}.getType();
    }
    
    if ("PageAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAjusteResponse>(){}.getType();
    }
    
    if ("PageAnuidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAnuidadeResponse>(){}.getType();
    }
    
    if ("PageAplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAplicacaoMobileResponse>(){}.getType();
    }
    
    if ("PageArquivoAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageArquivoAUDResponse>(){}.getType();
    }
    
    if ("PageArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageArquivoResponse>(){}.getType();
    }
    
    if ("PageAtendimentoClienteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAtendimentoClienteResponse>(){}.getType();
    }
    
    if ("PageAvisoViagemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageAvisoViagemResponse>(){}.getType();
    }
    
    if ("PageBancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageBancoResponse>(){}.getType();
    }
    
    if ("PageBinResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageBinResponse>(){}.getType();
    }
    
    if ("PageBoletoListarResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageBoletoListarResponse>(){}.getType();
    }
    
    if ("PageCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCampanhaResponse>(){}.getType();
    }
    
    if ("PageCampoCodificadoDescricaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCampoCodificadoDescricaoResponse>(){}.getType();
    }
    
    if ("PageCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCartaoResponse>(){}.getType();
    }
    
    if ("PageCodigoChargebackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCodigoChargebackResponse>(){}.getType();
    }
    
    if ("PageCodigoSegurancaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCodigoSegurancaResponse>(){}.getType();
    }
    
    if ("PageCompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCompraResponse>(){}.getType();
    }
    
    if ("PageConfiguracaoEmailResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConfiguracaoEmailResponse>(){}.getType();
    }
    
    if ("PageConfiguracaoRotativoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConfiguracaoRotativoResponse>(){}.getType();
    }
    
    if ("PageContaBancariaPortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageContaBancariaPortadorResponse>(){}.getType();
    }
    
    if ("PageContaDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageContaDebitoRecorrenteResponse>(){}.getType();
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
    
    if ("PageControleSegurancaDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageControleSegurancaDispositivoResponse>(){}.getType();
    }
    
    if ("PageControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageControleVencimentoResponse>(){}.getType();
    }
    
    if ("PageConvenioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConvenioResponse>(){}.getType();
    }
    
    if ("PageDadosBancariosContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageDadosBancariosContaResponse>(){}.getType();
    }
    
    if ("PageDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageDispositivoResponse>(){}.getType();
    }
    
    if ("PageDocumentoCreditoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageDocumentoCreditoResponse>(){}.getType();
    }
    
    if ("PageDocumentoPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageDocumentoPropostaResponse>(){}.getType();
    }
    
    if ("PageDocumentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageDocumentoResponse>(){}.getType();
    }
    
    if ("PageDocumentoTemplateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageDocumentoTemplateResponse>(){}.getType();
    }
    
    if ("PageEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageEnderecoResponse>(){}.getType();
    }
    
    if ("PageEntidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageEntidadeResponse>(){}.getType();
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
    
    if ("PageFaturaFechadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturaFechadaResponse>(){}.getType();
    }
    
    if ("PageFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturaResponse>(){}.getType();
    }
    
    if ("PageGrupoChargebackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageGrupoChargebackResponse>(){}.getType();
    }
    
    if ("PageGrupoEconomicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageGrupoEconomicoResponse>(){}.getType();
    }
    
    if ("PageGrupoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageGrupoOrigemComercialResponse>(){}.getType();
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
    
    if ("PageHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoPagamentoResponse>(){}.getType();
    }
    
    if ("PageInscricaoAPNResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageInscricaoAPNResponse>(){}.getType();
    }
    
    if ("PageLoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageLoteCartoesPrePagosResponse>(){}.getType();
    }
    
    if ("PageMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageMCCResponse>(){}.getType();
    }
    
    if ("PageMaquinetaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageMaquinetaResponse>(){}.getType();
    }
    
    if ("PageMoedaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageMoedaResponse>(){}.getType();
    }
    
    if ("PageOperacaoCredorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageOperacaoCredorResponse>(){}.getType();
    }
    
    if ("PageOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageOperacaoResponse>(){}.getType();
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
    
    if ("PageParametroProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageParametroProdutoResponse>(){}.getType();
    }
    
    if ("PagePessoaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePessoaDetalheResponse>(){}.getType();
    }
    
    if ("PagePessoaJuridicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePessoaJuridicaResponse>(){}.getType();
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
    
    if ("PageProdutoPacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageProdutoPacoteTarifaResponse>(){}.getType();
    }
    
    if ("PageProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageProdutoResponse>(){}.getType();
    }
    
    if ("PagePromotorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePromotorResponse>(){}.getType();
    }
    
    if ("PagePropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePropostaResponse>(){}.getType();
    }
    
    if ("PagePushResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePushResponse>(){}.getType();
    }
    
    if ("PageRelatorioMovimentosControleProcessos".equalsIgnoreCase(className)) {
      return new TypeToken<PageRelatorioMovimentosControleProcessos>(){}.getType();
    }
    
    if ("PageRiskFraudResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageRiskFraudResponse>(){}.getType();
    }
    
    if ("PageSMSEnvioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageSMSEnvioResponse>(){}.getType();
    }
    
    if ("PageSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageSMSResponse>(){}.getType();
    }
    
    if ("PageServicoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageServicoContaResponse>(){}.getType();
    }
    
    if ("PageStatusArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusArquivoResponse>(){}.getType();
    }
    
    if ("PageStatusBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusBoletoResponse>(){}.getType();
    }
    
    if ("PageStatusCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusCartaoResponse>(){}.getType();
    }
    
    if ("PageStatusContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusContaResponse>(){}.getType();
    }
    
    if ("PageStatusContestacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusContestacaoResponse>(){}.getType();
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
    
    if ("PageStatusPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusPropostaResponse>(){}.getType();
    }
    
    if ("PageTaxasRefinanciamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTaxasRefinanciamentoResponse>(){}.getType();
    }
    
    if ("PageTelefoneEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTelefoneEstabelecimentoResponse>(){}.getType();
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
    
    if ("PageTipoArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoArquivoResponse>(){}.getType();
    }
    
    if ("PageTipoBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoBoletoResponse>(){}.getType();
    }
    
    if ("PageTipoCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoCampanhaResponse>(){}.getType();
    }
    
    if ("PageTipoChaveResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoChaveResponse>(){}.getType();
    }
    
    if ("PageTipoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoContaBancariaResponse>(){}.getType();
    }
    
    if ("PageTipoDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoDebitoRecorrenteResponse>(){}.getType();
    }
    
    if ("PageTipoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoEnderecoResponse>(){}.getType();
    }
    
    if ("PageTipoEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoEstabelecimentoResponse>(){}.getType();
    }
    
    if ("PageTipoFaturamentoPorContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoFaturamentoPorContaResponse>(){}.getType();
    }
    
    if ("PageTipoFaturamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoFaturamentoResponse>(){}.getType();
    }
    
    if ("PageTipoOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("PageTipoOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoOportunidadeResponse>(){}.getType();
    }
    
    if ("PageTipoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoOrigemComercialResponse>(){}.getType();
    }
    
    if ("PageTipoResolucaoContestacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoResolucaoContestacaoResponse>(){}.getType();
    }
    
    if ("PageTipoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoServicoResponse>(){}.getType();
    }
    
    if ("PageTipoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoTelefoneResponse>(){}.getType();
    }
    
    if ("PageTipoTemplateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoTemplateResponse>(){}.getType();
    }
    
    if ("PageTipoTerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoTerminalResponse>(){}.getType();
    }
    
    if ("PageTransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacaoNaoProcessadaResponse>(){}.getType();
    }
    
    if ("PageTransacaoProcessadaNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacaoProcessadaNaoProcessadaResponse>(){}.getType();
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
    
    if ("PageTransferenciaCreditoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransferenciaCreditoContaBancariaResponse>(){}.getType();
    }
    
    if ("PageTransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransferenciaResponse>(){}.getType();
    }
    
    if ("PageUsuarioContasResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageUsuarioContasResponse>(){}.getType();
    }
    
    if ("PageUsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageUsuarioResponse>(){}.getType();
    }
    
    if ("PageUsuarioTokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageUsuarioTokenResponse>(){}.getType();
    }
    
    if ("PageVinculoEstabelecimentoAdquirenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageVinculoEstabelecimentoAdquirenteResponse>(){}.getType();
    }
    
    if ("PageVinculoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageVinculoOperacaoResponse>(){}.getType();
    }
    
    if ("PageWebHookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageWebHookResponse>(){}.getType();
    }
    
    if ("PaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PaisResponse>(){}.getType();
    }
    
    if ("ParametroEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroEmissorResponse>(){}.getType();
    }
    
    if ("ParametroProdutoPartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroProdutoPartialUpdate>(){}.getType();
    }
    
    if ("ParametroProdutoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroProdutoPersist>(){}.getType();
    }
    
    if ("ParametroProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroProdutoResponse>(){}.getType();
    }
    
    if ("ParametrosProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParametrosProdutoResponse>(){}.getType();
    }
    
    if ("ParcelaAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParcelaAcordoResponse>(){}.getType();
    }
    
    if ("ParcelamentoTransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParcelamentoTransferenciaResponse>(){}.getType();
    }
    
    if ("PaymentAgreementAgreement".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentAgreementAgreement>(){}.getType();
    }
    
    if ("PersonPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PersonPersist>(){}.getType();
    }
    
    if ("PessoaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaDetalheResponse>(){}.getType();
    }
    
    if ("PessoaJuridicaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaJuridicaAprovadaPersist>(){}.getType();
    }
    
    if ("PessoaJuridicaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaJuridicaAprovadaResponse>(){}.getType();
    }
    
    if ("PessoaJuridicaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaJuridicaPersist>(){}.getType();
    }
    
    if ("PessoaJuridicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaJuridicaResponse>(){}.getType();
    }
    
    if ("PessoaJuridicaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaJuridicaUpdate>(){}.getType();
    }
    
    if ("PessoaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaResponse>(){}.getType();
    }
    
    if ("PlanCampaignUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PlanCampaignUpdate>(){}.getType();
    }
    
    if ("PlanInstallmentAgreementRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PlanInstallmentAgreementRequest>(){}.getType();
    }
    
    if ("PlanInstallmentAgreementResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanInstallmentAgreementResponse>(){}.getType();
    }
    
    if ("PlanoCampanhaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoCampanhaPersist>(){}.getType();
    }
    
    if ("PlanoCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoCampanhaResponse>(){}.getType();
    }
    
    if ("PlanoParcelamentoEmprestimoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoParcelamentoEmprestimoResponse>(){}.getType();
    }
    
    if ("PlanoParcelamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoParcelamentoResponse>(){}.getType();
    }
    
    if ("PlanoParcelamentoTransferenciaCreditoContaBancariaRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoParcelamentoTransferenciaCreditoContaBancariaRequest>(){}.getType();
    }
    
    if ("PlanoParcelamentoTransferenciaCreditoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoParcelamentoTransferenciaCreditoContaBancariaResponse>(){}.getType();
    }
    
    if ("PlataformaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobileResponse>(){}.getType();
    }
    
    if ("PlatformMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<PlatformMobilePersist>(){}.getType();
    }
    
    if ("PlatformMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PlatformMobileUpdate>(){}.getType();
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
    
    if ("ProdutoPacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProdutoPacoteTarifaResponse>(){}.getType();
    }
    
    if ("ProdutoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProdutoResponse>(){}.getType();
    }
    
    if ("PromotorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PromotorResponse>(){}.getType();
    }
    
    if ("PropostaParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PropostaParcialUpdate>(){}.getType();
    }
    
    if ("PropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PropostaResponse>(){}.getType();
    }
    
    if ("PropriedadeDocumentoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PropriedadeDocumentoRequest>(){}.getType();
    }
    
    if ("PushAPNS".equalsIgnoreCase(className)) {
      return new TypeToken<PushAPNS>(){}.getType();
    }
    
    if ("PushFCMAndGCM".equalsIgnoreCase(className)) {
      return new TypeToken<PushFCMAndGCM>(){}.getType();
    }
    
    if ("RefenceCommercialApprovedPersist".equalsIgnoreCase(className)) {
      return new TypeToken<RefenceCommercialApprovedPersist>(){}.getType();
    }
    
    if ("ReferenciaComercialAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ReferenciaComercialAprovadoResponse>(){}.getType();
    }
    
    if ("ReferenciaIdPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ReferenciaIdPersist>(){}.getType();
    }
    
    if ("RelatorioMovimentosControleProcessosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RelatorioMovimentosControleProcessosResponse>(){}.getType();
    }
    
    if ("RepresentationOfTheResourceEntryOfRegisteringAServiceAccount".equalsIgnoreCase(className)) {
      return new TypeToken<RepresentationOfTheResourceEntryOfRegisteringAServiceAccount>(){}.getType();
    }
    
    if ("RiscoFraudeDetalhadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RiscoFraudeDetalhadoResponse>(){}.getType();
    }
    
    if ("RiskFraudResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RiskFraudResponse>(){}.getType();
    }
    
    if ("SMSEnvioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SMSEnvioResponse>(){}.getType();
    }
    
    if ("Secure3dRequest".equalsIgnoreCase(className)) {
      return new TypeToken<Secure3dRequest>(){}.getType();
    }
    
    if ("SensibilizarSaldoGlobalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<SensibilizarSaldoGlobalUpdate>(){}.getType();
    }
    
    if ("ServicoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ServicoContaResponse>(){}.getType();
    }
    
    if ("SocioAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SocioAprovadoResponse>(){}.getType();
    }
    
    if ("StatusArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusArquivoResponse>(){}.getType();
    }
    
    if ("StatusBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusBoletoResponse>(){}.getType();
    }
    
    if ("StatusCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusCartaoResponse>(){}.getType();
    }
    
    if ("StatusContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusContaResponse>(){}.getType();
    }
    
    if ("StatusContestacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusContestacaoResponse>(){}.getType();
    }
    
    if ("StatusImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusImpressaoResponse>(){}.getType();
    }
    
    if ("StatusOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("StatusOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOportunidadeResponse>(){}.getType();
    }
    
    if ("StatusOpportunity".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOpportunity>(){}.getType();
    }
    
    if ("StatusPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusPropostaResponse>(){}.getType();
    }
    
    if ("StatusPropostaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<StatusPropostaUpdate>(){}.getType();
    }
    
    if ("StrongPassword".equalsIgnoreCase(className)) {
      return new TypeToken<StrongPassword>(){}.getType();
    }
    
    if ("TaxaAntecipacaoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TaxaAntecipacaoRequest>(){}.getType();
    }
    
    if ("TaxaJurosContaListaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TaxaJurosContaListaResponse>(){}.getType();
    }
    
    if ("TaxaJurosContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TaxaJurosContaResponse>(){}.getType();
    }
    
    if ("TaxaTaxaJurosConta".equalsIgnoreCase(className)) {
      return new TypeToken<TaxaTaxaJurosConta>(){}.getType();
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
    
    if ("TelefoneEscritorioCobrancaDTO".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneEscritorioCobrancaDTO>(){}.getType();
    }
    
    if ("TelefoneEstabelecimentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneEstabelecimentoPersist>(){}.getType();
    }
    
    if ("TelefoneEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneEstabelecimentoResponse>(){}.getType();
    }
    
    if ("TelefoneEstabelecimentoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneEstabelecimentoUpdate>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TelefonePessoaAprovadaResponse>(){}.getType();
    }
    
    if ("TelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneResponse>(){}.getType();
    }
    
    if ("TelephonePersonApprovedPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TelephonePersonApprovedPersist>(){}.getType();
    }
    
    if ("TemplateNotificacaoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TemplateNotificacaoDetalheResponse>(){}.getType();
    }
    
    if ("TemplateNotificacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TemplateNotificacaoResponse>(){}.getType();
    }
    
    if ("TerminalPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TerminalPersist>(){}.getType();
    }
    
    if ("TerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TerminalResponse>(){}.getType();
    }
    
    if ("TerminalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TerminalUpdate>(){}.getType();
    }
    
    if ("TipoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoAjusteResponse>(){}.getType();
    }
    
    if ("TipoArquivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoArquivoResponse>(){}.getType();
    }
    
    if ("TipoBoletoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoBoletoResponse>(){}.getType();
    }
    
    if ("TipoCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoCampanhaResponse>(){}.getType();
    }
    
    if ("TipoChaveResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoChaveResponse>(){}.getType();
    }
    
    if ("TipoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoContaBancariaResponse>(){}.getType();
    }
    
    if ("TipoDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoDebitoRecorrenteResponse>(){}.getType();
    }
    
    if ("TipoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoEnderecoResponse>(){}.getType();
    }
    
    if ("TipoEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoEstabelecimentoResponse>(){}.getType();
    }
    
    if ("TipoFaturamentoPorContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoFaturamentoPorContaResponse>(){}.getType();
    }
    
    if ("TipoFaturamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoFaturamentoResponse>(){}.getType();
    }
    
    if ("TipoOperacaoParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOperacaoParcialUpdate>(){}.getType();
    }
    
    if ("TipoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOperacaoResponse>(){}.getType();
    }
    
    if ("TipoOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("TipoOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOportunidadeResponse>(){}.getType();
    }
    
    if ("TipoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOrigemComercialResponse>(){}.getType();
    }
    
    if ("TipoResolucaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoResolucaoResponse>(){}.getType();
    }
    
    if ("TipoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoServicoResponse>(){}.getType();
    }
    
    if ("TipoTelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTelefoneResponse>(){}.getType();
    }
    
    if ("TipoTemplateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTemplateRequest>(){}.getType();
    }
    
    if ("TipoTemplateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTemplateResponse>(){}.getType();
    }
    
    if ("TipoTerminalResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTerminalResponse>(){}.getType();
    }
    
    if ("TipoTransacaoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTransacaoAjusteResponse>(){}.getType();
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
    
    if ("TransacaoProcessadaNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoProcessadaNaoProcessadaResponse>(){}.getType();
    }
    
    if ("TransacoesCorrentesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacoesCorrentesResponse>(){}.getType();
    }
    
    if ("TransferBankingPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TransferBankingPersist>(){}.getType();
    }
    
    if ("TransferCreditBankingAccountPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TransferCreditBankingAccountPersist>(){}.getType();
    }
    
    if ("TransferenciaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaBancariaResponse>(){}.getType();
    }
    
    if ("TransferenciaCreditoContaBancariaListaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaCreditoContaBancariaListaResponse>(){}.getType();
    }
    
    if ("TransferenciaCreditoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaCreditoContaBancariaResponse>(){}.getType();
    }
    
    if ("TransferenciaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaDetalheResponse>(){}.getType();
    }
    
    if ("TransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaResponse>(){}.getType();
    }
    
    if ("TypeBillingPerAccountPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TypeBillingPerAccountPersist>(){}.getType();
    }
    
    if ("TypeBillingPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TypeBillingPersist>(){}.getType();
    }
    
    if ("TypeOpportunity".equalsIgnoreCase(className)) {
      return new TypeToken<TypeOpportunity>(){}.getType();
    }
    
    if ("UserToken".equalsIgnoreCase(className)) {
      return new TypeToken<UserToken>(){}.getType();
    }
    
    if ("UserUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<UserUpdate>(){}.getType();
    }
    
    if ("UsuarioContasResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioContasResponse>(){}.getType();
    }
    
    if ("UsuarioDispositivoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioDispositivoPersist>(){}.getType();
    }
    
    if ("UsuarioDispositivoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioDispositivoUpdate>(){}.getType();
    }
    
    if ("UsuarioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioPersist>(){}.getType();
    }
    
    if ("UsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioResponse>(){}.getType();
    }
    
    if ("UsuarioTokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioTokenResponse>(){}.getType();
    }
    
    if ("ValidaCVVRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ValidaCVVRequest>(){}.getType();
    }
    
    if ("ValidaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ValidaCartaoResponse>(){}.getType();
    }
    
    if ("ValidaSenhaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ValidaSenhaCartaoResponse>(){}.getType();
    }
    
    if ("ValidarSenhaLoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ValidarSenhaLoginRequest>(){}.getType();
    }
    
    if ("VencimentoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<VencimentoUpdate>(){}.getType();
    }
    
    if ("VinculoCartoesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<VinculoCartoesResponse>(){}.getType();
    }
    
    if ("VinculoEstabelecimentoAdquirentePersist".equalsIgnoreCase(className)) {
      return new TypeToken<VinculoEstabelecimentoAdquirentePersist>(){}.getType();
    }
    
    if ("VinculoEstabelecimentoAdquirenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<VinculoEstabelecimentoAdquirenteResponse>(){}.getType();
    }
    
    if ("VinculoOperacaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<VinculoOperacaoPersist>(){}.getType();
    }
    
    if ("VinculoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<VinculoOperacaoResponse>(){}.getType();
    }
    
    if ("WebHook".equalsIgnoreCase(className)) {
      return new TypeToken<WebHook>(){}.getType();
    }
    
    if ("WebHookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WebHookResponse>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
