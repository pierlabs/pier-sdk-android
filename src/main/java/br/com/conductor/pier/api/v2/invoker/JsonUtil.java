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
    
    if ("AcordoBoletoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AcordoBoletoPersist>>(){}.getType();
    }
    
    if ("AcordoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AcordoDetalheResponse>>(){}.getType();
    }
    
    if ("AcordoEmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AcordoEmailRequest>>(){}.getType();
    }
    
    if ("AcordoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AcordoPersist>>(){}.getType();
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
    
    if ("AdesaoPacoteTarifaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdesaoPacoteTarifaUpdate>>(){}.getType();
    }
    
    if ("AdesaoPagamentoSabadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdesaoPagamentoSabadoResponse>>(){}.getType();
    }
    
    if ("AdesaoServicoPartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdesaoServicoPartialUpdate>>(){}.getType();
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
    
    if ("AjustePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AjustePersist>>(){}.getType();
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
    
    if ("AplicacaoMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobilePersist>>(){}.getType();
    }
    
    if ("AplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobileResponse>>(){}.getType();
    }
    
    if ("AplicacaoMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<AplicacaoMobileUpdate>>(){}.getType();
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
    
    if ("AtribuirCartaoPessoaRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AtribuirCartaoPessoaRequest>>(){}.getType();
    }
    
    if ("AutorizacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AutorizacaoOnUsRequest>>(){}.getType();
    }
    
    if ("AutorizacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AutorizacaoResponse>>(){}.getType();
    }
    
    if ("AvisoViagemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AvisoViagemResponse>>(){}.getType();
    }
    
    if ("BancoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<BancoPersist>>(){}.getType();
    }
    
    if ("BancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BancoResponse>>(){}.getType();
    }
    
    if ("BancoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<BancoUpdate>>(){}.getType();
    }
    
    if ("BeneficioPagamentoAtrasoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BeneficioPagamentoAtrasoResponse>>(){}.getType();
    }
    
    if ("BeneficioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<BeneficioPersist>>(){}.getType();
    }
    
    if ("BeneficioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BeneficioResponse>>(){}.getType();
    }
    
    if ("BeneficioUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<BeneficioUpdate>>(){}.getType();
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
    
    if ("CampanhaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CampanhaPersist>>(){}.getType();
    }
    
    if ("CampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CampanhaResponse>>(){}.getType();
    }
    
    if ("CampanhaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<CampanhaUpdate>>(){}.getType();
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
    
    if ("CartaoEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoEmissorResponse>>(){}.getType();
    }
    
    if ("CartaoImpressaoProvisorioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoImpressaoProvisorioResponse>>(){}.getType();
    }
    
    if ("CartaoImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoImpressaoResponse>>(){}.getType();
    }
    
    if ("CartaoLoteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoLoteResponse>>(){}.getType();
    }
    
    if ("CartaoMifareRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoMifareRequest>>(){}.getType();
    }
    
    if ("CartaoMultiAppImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoMultiAppImpressaoResponse>>(){}.getType();
    }
    
    if ("CartaoMultiAppPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoMultiAppPersist>>(){}.getType();
    }
    
    if ("CartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoResponse>>(){}.getType();
    }
    
    if ("CartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<CartaoUpdate>>(){}.getType();
    }
    
    if ("CdtAutorizacao".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtAutorizacao>>(){}.getType();
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
    
    if ("CdtEventoExternoCompra".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtEventoExternoCompra>>(){}.getType();
    }
    
    if ("CdtTipoContaBancaria".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtTipoContaBancaria>>(){}.getType();
    }
    
    if ("CdtTipoOperacao".equalsIgnoreCase(className)) {
      return new TypeToken<List<CdtTipoOperacao>>(){}.getType();
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
    
    if ("ConfiguracaoControleCartaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoControleCartaoPersist>>(){}.getType();
    }
    
    if ("ConfiguracaoControleCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoControleCartaoResponse>>(){}.getType();
    }
    
    if ("ConfiguracaoControleCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoControleCartaoUpdate>>(){}.getType();
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
    
    if ("ConfiguracaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfiguracaoSMSResponse>>(){}.getType();
    }
    
    if ("ConsultaCadastroEstabelecimentoDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultaCadastroEstabelecimentoDTO>>(){}.getType();
    }
    
    if ("ConsultarSenhaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConsultarSenhaCartaoResponse>>(){}.getType();
    }
    
    if ("ContaAtribuirCartaoPrePagoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaAtribuirCartaoPrePagoRequest>>(){}.getType();
    }
    
    if ("ContaBancariaPortadorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaBancariaPortadorPersist>>(){}.getType();
    }
    
    if ("ContaBancariaPortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaBancariaPortadorResponse>>(){}.getType();
    }
    
    if ("ContaBancariaPortadorUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaBancariaPortadorUpdate>>(){}.getType();
    }
    
    if ("ContaDebitoRecorrente".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDebitoRecorrente>>(){}.getType();
    }
    
    if ("ContaDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDebitoRecorrenteResponse>>(){}.getType();
    }
    
    if ("ContaDebitoTarifaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDebitoTarifaPersist>>(){}.getType();
    }
    
    if ("ContaDebitoTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDebitoTarifaResponse>>(){}.getType();
    }
    
    if ("ContaDebitoTarifaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDebitoTarifaUpdate>>(){}.getType();
    }
    
    if ("ContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaDetalheResponse>>(){}.getType();
    }
    
    if ("ContaHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaHistoricoPagamentoResponse>>(){}.getType();
    }
    
    if ("ContaMultiAppPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaMultiAppPersist>>(){}.getType();
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
    
    if ("ControleCartaoGrupoMCCPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleCartaoGrupoMCCPersist>>(){}.getType();
    }
    
    if ("ControleCartaoGrupoMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleCartaoGrupoMCCResponse>>(){}.getType();
    }
    
    if ("ControleLimiteCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleLimiteCartaoResponse>>(){}.getType();
    }
    
    if ("ControleLimiteCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleLimiteCartaoUpdate>>(){}.getType();
    }
    
    if ("ControleLimitesCartaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleLimitesCartaoPersist>>(){}.getType();
    }
    
    if ("ControleSegurancaDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleSegurancaDispositivoResponse>>(){}.getType();
    }
    
    if ("ControleSubcontaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleSubcontaPersist>>(){}.getType();
    }
    
    if ("ControleSubcontaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleSubcontaResponse>>(){}.getType();
    }
    
    if ("ControleSubcontaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ControleSubcontaUpdate>>(){}.getType();
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
    
    if ("CotacaoDolarResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CotacaoDolarResponse>>(){}.getType();
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
    
    if ("CvvDinamicoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<CvvDinamicoPersist>>(){}.getType();
    }
    
    if ("CvvDinamicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CvvDinamicoResponse>>(){}.getType();
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
    
    if ("DesfazimentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<DesfazimentoTransacaoOnUsRequest>>(){}.getType();
    }
    
    if ("DetalheOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalheOperacaoResponse>>(){}.getType();
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
    
    if ("DetalhesExtratoTarifasResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetalhesExtratoTarifasResponse>>(){}.getType();
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
    
    if ("EnderecoAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoAprovadoPersist>>(){}.getType();
    }
    
    if ("EnderecoAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EnderecoAprovadoResponse>>(){}.getType();
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
    
    if ("EventoExternoCompraParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<EventoExternoCompraParcialUpdate>>(){}.getType();
    }
    
    if ("EventoExternoCompraPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<EventoExternoCompraPersist>>(){}.getType();
    }
    
    if ("EventoExternoCompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EventoExternoCompraResponse>>(){}.getType();
    }
    
    if ("ExtratoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtratoResponse>>(){}.getType();
    }
    
    if ("ExtratoTarifasResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtratoTarifasResponse>>(){}.getType();
    }
    
    if ("FantasiaBasicaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<FantasiaBasicaPersist>>(){}.getType();
    }
    
    if ("FantasiaBasicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FantasiaBasicaResponse>>(){}.getType();
    }
    
    if ("FaqResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaqResponse>>(){}.getType();
    }
    
    if ("FaturaAbertaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaAbertaResponse>>(){}.getType();
    }
    
    if ("FaturaConsignadaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaConsignadaDetalheResponse>>(){}.getType();
    }
    
    if ("FaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaConsignadaResponse>>(){}.getType();
    }
    
    if ("FaturaConsolidadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaConsolidadaResponse>>(){}.getType();
    }
    
    if ("FaturaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaDetalheResponse>>(){}.getType();
    }
    
    if ("FaturaFechadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaFechadaResponse>>(){}.getType();
    }
    
    if ("FaturaFuturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FaturaFuturaResponse>>(){}.getType();
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
    
    if ("GrupoEstabelecimentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoEstabelecimentoPersist>>(){}.getType();
    }
    
    if ("GrupoEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoEstabelecimentoResponse>>(){}.getType();
    }
    
    if ("GrupoEstabelecimentoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoEstabelecimentoUpdate>>(){}.getType();
    }
    
    if ("GrupoMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoMCCResponse>>(){}.getType();
    }
    
    if ("GrupoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoOrigemComercialResponse>>(){}.getType();
    }
    
    if ("GrupoTransacaoLojistaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GrupoTransacaoLojistaResponse>>(){}.getType();
    }
    
    if ("HistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoAssessoriaResponse>>(){}.getType();
    }
    
    if ("HistoricoAtrasoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoAtrasoFaturaResponse>>(){}.getType();
    }
    
    if ("HistoricoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<HistoricoEnderecoResponse>>(){}.getType();
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
    
    if ("IndicacaoAmigoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<IndicacaoAmigoPersist>>(){}.getType();
    }
    
    if ("IndicacaoAmigoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<IndicacaoAmigoResponse>>(){}.getType();
    }
    
    if ("IndicacaoAmigoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<IndicacaoAmigoUpdate>>(){}.getType();
    }
    
    if ("InscricaoAPN".equalsIgnoreCase(className)) {
      return new TypeToken<List<InscricaoAPN>>(){}.getType();
    }
    
    if ("InscricaoAPNResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<InscricaoAPNResponse>>(){}.getType();
    }
    
    if ("InstituicaoPagamentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<InstituicaoPagamentoPersist>>(){}.getType();
    }
    
    if ("InstituicaoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<InstituicaoPagamentoResponse>>(){}.getType();
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
    
    if ("LimiteDisponibilidadeLogResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimiteDisponibilidadeLogResponse>>(){}.getType();
    }
    
    if ("LimiteDisponibilidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimiteDisponibilidadeResponse>>(){}.getType();
    }
    
    if ("LimitePortadorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimitePortadorPersist>>(){}.getType();
    }
    
    if ("LimitePortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LimitePortadorResponse>>(){}.getType();
    }
    
    if ("LogAcessoUsuarioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogAcessoUsuarioPersist>>(){}.getType();
    }
    
    if ("LogAcessoUsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogAcessoUsuarioResponse>>(){}.getType();
    }
    
    if ("LogRequisicaoMobilePartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogRequisicaoMobilePartialUpdate>>(){}.getType();
    }
    
    if ("LogRequisicaoMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogRequisicaoMobilePersist>>(){}.getType();
    }
    
    if ("LogRequisicaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogRequisicaoMobileResponse>>(){}.getType();
    }
    
    if ("LoteCartaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoteCartaoPersist>>(){}.getType();
    }
    
    if ("LoteCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoteCartaoResponse>>(){}.getType();
    }
    
    if ("LoteCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoteCartaoUpdate>>(){}.getType();
    }
    
    if ("LoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoteCartoesPrePagosResponse>>(){}.getType();
    }
    
    if ("MCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MCCResponse>>(){}.getType();
    }
    
    if ("MapOfstringAndobject".equalsIgnoreCase(className)) {
      return new TypeToken<List<MapOfstringAndobject>>(){}.getType();
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
    
    if ("MotivoFraudePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<MotivoFraudePersist>>(){}.getType();
    }
    
    if ("MotivoFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MotivoFraudeResponse>>(){}.getType();
    }
    
    if ("MotivoFraudeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<MotivoFraudeUpdate>>(){}.getType();
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
    
    if ("NotificacaoSMSBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoSMSBody>>(){}.getType();
    }
    
    if ("NotificacaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<NotificacaoSMSResponse>>(){}.getType();
    }
    
    if ("ObjetoPessoaFsicaAprovada".equalsIgnoreCase(className)) {
      return new TypeToken<List<ObjetoPessoaFsicaAprovada>>(){}.getType();
    }
    
    if ("ObjetoPessoaFsicaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ObjetoPessoaFsicaAprovadaResponse>>(){}.getType();
    }
    
    if ("OperacaoBancariaParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperacaoBancariaParcialUpdate>>(){}.getType();
    }
    
    if ("OperacaoBancariaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperacaoBancariaPersist>>(){}.getType();
    }
    
    if ("OperacaoBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OperacaoBancariaResponse>>(){}.getType();
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
    
    if ("OportunidadePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadePersist>>(){}.getType();
    }
    
    if ("OportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadeResponse>>(){}.getType();
    }
    
    if ("OportunidadeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<OportunidadeUpdate>>(){}.getType();
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
    
    if ("PacoteTarifaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PacoteTarifaPersist>>(){}.getType();
    }
    
    if ("PacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PacoteTarifaResponse>>(){}.getType();
    }
    
    if ("PacoteTarifaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PacoteTarifaUpdate>>(){}.getType();
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
    
    if ("PageBeneficioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageBeneficioResponse>>(){}.getType();
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
    
    if ("PageCartaoLoteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCartaoLoteResponse>>(){}.getType();
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
    
    if ("PageConfiguracaoControleCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConfiguracaoControleCartaoResponse>>(){}.getType();
    }
    
    if ("PageConfiguracaoEmailResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConfiguracaoEmailResponse>>(){}.getType();
    }
    
    if ("PageConfiguracaoRotativoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConfiguracaoRotativoResponse>>(){}.getType();
    }
    
    if ("PageConfiguracaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConfiguracaoSMSResponse>>(){}.getType();
    }
    
    if ("PageContaBancariaPortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContaBancariaPortadorResponse>>(){}.getType();
    }
    
    if ("PageContaDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContaDebitoRecorrenteResponse>>(){}.getType();
    }
    
    if ("PageContaDebitoTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageContaDebitoTarifaResponse>>(){}.getType();
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
    
    if ("PageControleCartaoGrupoMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageControleCartaoGrupoMCCResponse>>(){}.getType();
    }
    
    if ("PageControleLimiteCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageControleLimiteCartaoResponse>>(){}.getType();
    }
    
    if ("PageControleSegurancaDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageControleSegurancaDispositivoResponse>>(){}.getType();
    }
    
    if ("PageControleSubcontaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageControleSubcontaResponse>>(){}.getType();
    }
    
    if ("PageControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageControleVencimentoResponse>>(){}.getType();
    }
    
    if ("PageConvenioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageConvenioResponse>>(){}.getType();
    }
    
    if ("PageCotacaoDolarResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCotacaoDolarResponse>>(){}.getType();
    }
    
    if ("PageCredorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageCredorResponse>>(){}.getType();
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
    
    if ("PageExtratoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageExtratoResponse>>(){}.getType();
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
    
    if ("PageFaturaConsolidadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturaConsolidadaResponse>>(){}.getType();
    }
    
    if ("PageFaturaFechadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturaFechadaResponse>>(){}.getType();
    }
    
    if ("PageFaturaFuturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageFaturaFuturaResponse>>(){}.getType();
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
    
    if ("PageGrupoEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageGrupoEstabelecimentoResponse>>(){}.getType();
    }
    
    if ("PageGrupoMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageGrupoMCCResponse>>(){}.getType();
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
    
    if ("PageHistoricoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoEnderecoResponse>>(){}.getType();
    }
    
    if ("PageHistoricoEventosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoEventosResponse>>(){}.getType();
    }
    
    if ("PageHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageHistoricoPagamentoResponse>>(){}.getType();
    }
    
    if ("PageIndicacaoAmigoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageIndicacaoAmigoResponse>>(){}.getType();
    }
    
    if ("PageInscricaoAPNResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageInscricaoAPNResponse>>(){}.getType();
    }
    
    if ("PageInstituicoesPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageInstituicoesPagamentoResponse>>(){}.getType();
    }
    
    if ("PageLoteCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageLoteCartaoResponse>>(){}.getType();
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
    
    if ("PageMotivoFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageMotivoFraudeResponse>>(){}.getType();
    }
    
    if ("PageOperacaoBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageOperacaoBancariaResponse>>(){}.getType();
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
    
    if ("PagePIEROfLimiteDisponibilidadeLogResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePIEROfLimiteDisponibilidadeLogResponse>>(){}.getType();
    }
    
    if ("PagePaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePaisResponse>>(){}.getType();
    }
    
    if ("PageParametroAcumuladorContaOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageParametroAcumuladorContaOperacaoResponse>>(){}.getType();
    }
    
    if ("PageParametroAcumuladorProdutoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageParametroAcumuladorProdutoOperacaoResponse>>(){}.getType();
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
    
    if ("PagePortadorDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PagePortadorDebitoRecorrenteResponse>>(){}.getType();
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
    
    if ("PageProjecaoCompraNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageProjecaoCompraNaoProcessadaResponse>>(){}.getType();
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
    
    if ("PageRecargaCelularFavoritoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageRecargaCelularFavoritoResponse>>(){}.getType();
    }
    
    if ("PageRelatorioMovimentosControleProcessos".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageRelatorioMovimentosControleProcessos>>(){}.getType();
    }
    
    if ("PageSMSContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSMSContaResponse>>(){}.getType();
    }
    
    if ("PageSMSEnvioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSMSEnvioResponse>>(){}.getType();
    }
    
    if ("PageSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSMSResponse>>(){}.getType();
    }
    
    if ("PageSegurancaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSegurancaMobileResponse>>(){}.getType();
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
    
    if ("PageStatusCnabSumarizadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageStatusCnabSumarizadoResponse>>(){}.getType();
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
    
    if ("PageSuspeitaFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageSuspeitaFraudeResponse>>(){}.getType();
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
    
    if ("PageTipoBeneficioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoBeneficioResponse>>(){}.getType();
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
    
    if ("PageTipoOperacaoBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoOperacaoBancariaResponse>>(){}.getType();
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
    
    if ("PageTipoPlasticoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoPlasticoResponse>>(){}.getType();
    }
    
    if ("PageTipoResolucaoContestacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoResolucaoContestacaoResponse>>(){}.getType();
    }
    
    if ("PageTipoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoServicoResponse>>(){}.getType();
    }
    
    if ("PageTipoServicoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoServicoSMSResponse>>(){}.getType();
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
    
    if ("PageTipoTerminalTransacoesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoTerminalTransacoesResponse>>(){}.getType();
    }
    
    if ("PageTipoVinculoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTipoVinculoContaResponse>>(){}.getType();
    }
    
    if ("PageTiposOperacoesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTiposOperacoesResponse>>(){}.getType();
    }
    
    if ("PageTokenCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTokenCartaoResponse>>(){}.getType();
    }
    
    if ("PageTransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacaoNaoProcessadaResponse>>(){}.getType();
    }
    
    if ("PageTransacaoNegadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageTransacaoNegadaResponse>>(){}.getType();
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
    
    if ("PageVinculoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageVinculoContaResponse>>(){}.getType();
    }
    
    if ("PageVinculoEstabelecimentoAdquirenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageVinculoEstabelecimentoAdquirenteResponse>>(){}.getType();
    }
    
    if ("PageVinculoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PageVinculoOperacaoResponse>>(){}.getType();
    }
    
    if ("PaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaisResponse>>(){}.getType();
    }
    
    if ("ParametroAcumuladorContaOperacaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroAcumuladorContaOperacaoPersist>>(){}.getType();
    }
    
    if ("ParametroAcumuladorContaOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroAcumuladorContaOperacaoResponse>>(){}.getType();
    }
    
    if ("ParametroAcumuladorContaOperacaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroAcumuladorContaOperacaoUpdate>>(){}.getType();
    }
    
    if ("ParametroAcumuladorProdutoOperacaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroAcumuladorProdutoOperacaoPersist>>(){}.getType();
    }
    
    if ("ParametroAcumuladorProdutoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroAcumuladorProdutoOperacaoResponse>>(){}.getType();
    }
    
    if ("ParametroAcumuladorProdutoOperacaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParametroAcumuladorProdutoOperacaoUpdate>>(){}.getType();
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
    
    if ("ParcelamentoAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParcelamentoAcordoResponse>>(){}.getType();
    }
    
    if ("ParcelamentoTransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ParcelamentoTransferenciaResponse>>(){}.getType();
    }
    
    if ("PessoaDetalhePartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PessoaDetalhePartialUpdate>>(){}.getType();
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
    
    if ("PlanoCampanhaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoCampanhaPersist>>(){}.getType();
    }
    
    if ("PlanoCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoCampanhaResponse>>(){}.getType();
    }
    
    if ("PlanoCampanhaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoCampanhaUpdate>>(){}.getType();
    }
    
    if ("PlanoParcelamentoAcordoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoParcelamentoAcordoRequest>>(){}.getType();
    }
    
    if ("PlanoParcelamentoAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanoParcelamentoAcordoResponse>>(){}.getType();
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
    
    if ("PlataformaMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobilePersist>>(){}.getType();
    }
    
    if ("PlataformaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobileResponse>>(){}.getType();
    }
    
    if ("PlataformaMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlataformaMobileUpdate>>(){}.getType();
    }
    
    if ("PortadorDebitoRecorrentePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<PortadorDebitoRecorrentePersist>>(){}.getType();
    }
    
    if ("PortadorDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PortadorDebitoRecorrenteResponse>>(){}.getType();
    }
    
    if ("PortadorDebitoRecorrenteUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PortadorDebitoRecorrenteUpdate>>(){}.getType();
    }
    
    if ("PortadorParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<PortadorParcialUpdate>>(){}.getType();
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
    
    if ("ProjecaoCompraNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProjecaoCompraNaoProcessadaResponse>>(){}.getType();
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
    
    if ("PushFCMEGCM".equalsIgnoreCase(className)) {
      return new TypeToken<List<PushFCMEGCM>>(){}.getType();
    }
    
    if ("QuitacaoAnualResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<QuitacaoAnualResponse>>(){}.getType();
    }
    
    if ("RecargaCelularFavoritoParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<RecargaCelularFavoritoParcialUpdate>>(){}.getType();
    }
    
    if ("RecargaCelularFavoritoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<RecargaCelularFavoritoPersist>>(){}.getType();
    }
    
    if ("RecargaCelularFavoritoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RecargaCelularFavoritoResponse>>(){}.getType();
    }
    
    if ("ReferenciaComercialAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReferenciaComercialAprovadoPersist>>(){}.getType();
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
    
    if ("RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta".equalsIgnoreCase(className)) {
      return new TypeToken<List<RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta>>(){}.getType();
    }
    
    if ("SMSContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<SMSContaPersist>>(){}.getType();
    }
    
    if ("SMSContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SMSContaResponse>>(){}.getType();
    }
    
    if ("SMSEnvioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SMSEnvioResponse>>(){}.getType();
    }
    
    if ("Secure3dRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<Secure3dRequest>>(){}.getType();
    }
    
    if ("SegurancaMobileParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<SegurancaMobileParcialUpdate>>(){}.getType();
    }
    
    if ("SegurancaMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<SegurancaMobilePersist>>(){}.getType();
    }
    
    if ("SegurancaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SegurancaMobileResponse>>(){}.getType();
    }
    
    if ("SenhaDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<SenhaDTO>>(){}.getType();
    }
    
    if ("SenhaForte".equalsIgnoreCase(className)) {
      return new TypeToken<List<SenhaForte>>(){}.getType();
    }
    
    if ("SensibilizarSaldoGlobalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<SensibilizarSaldoGlobalUpdate>>(){}.getType();
    }
    
    if ("ServicoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ServicoContaResponse>>(){}.getType();
    }
    
    if ("SocioAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<SocioAprovadoPersist>>(){}.getType();
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
    
    if ("StatusCnabSumarizadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusCnabSumarizadoResponse>>(){}.getType();
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
    
    if ("StatusOportunidade".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOportunidade>>(){}.getType();
    }
    
    if ("StatusOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOportunidadeAUDResponse>>(){}.getType();
    }
    
    if ("StatusOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusOportunidadeResponse>>(){}.getType();
    }
    
    if ("StatusPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusPropostaResponse>>(){}.getType();
    }
    
    if ("StatusPropostaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<StatusPropostaUpdate>>(){}.getType();
    }
    
    if ("SuspeitaFraudePersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuspeitaFraudePersist>>(){}.getType();
    }
    
    if ("SuspeitaFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuspeitaFraudeResponse>>(){}.getType();
    }
    
    if ("SuspeitaFraudeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuspeitaFraudeUpdate>>(){}.getType();
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
    
    if ("TaxaJurosContaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TaxaJurosContaUpdate>>(){}.getType();
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
    
    if ("TelefonePessoaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefonePessoaAprovadaPersist>>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefonePessoaAprovadaResponse>>(){}.getType();
    }
    
    if ("TelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TelefoneResponse>>(){}.getType();
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
    
    if ("TipoBeneficioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoBeneficioResponse>>(){}.getType();
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
    
    if ("TipoFaturamentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoFaturamentoPersist>>(){}.getType();
    }
    
    if ("TipoFaturamentoPorContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoFaturamentoPorContaPersist>>(){}.getType();
    }
    
    if ("TipoFaturamentoPorContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoFaturamentoPorContaResponse>>(){}.getType();
    }
    
    if ("TipoFaturamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoFaturamentoResponse>>(){}.getType();
    }
    
    if ("TipoFuncaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoFuncaoResponse>>(){}.getType();
    }
    
    if ("TipoOperacaoBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOperacaoBancariaResponse>>(){}.getType();
    }
    
    if ("TipoOperacaoParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOperacaoParcialUpdate>>(){}.getType();
    }
    
    if ("TipoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOperacaoResponse>>(){}.getType();
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
    
    if ("TipoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoOrigemComercialResponse>>(){}.getType();
    }
    
    if ("TipoPlasticoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoPlasticoPersist>>(){}.getType();
    }
    
    if ("TipoPlasticoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoPlasticoResponse>>(){}.getType();
    }
    
    if ("TipoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoServicoResponse>>(){}.getType();
    }
    
    if ("TipoServicoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoServicoSMSResponse>>(){}.getType();
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
    
    if ("TipoTerminalTransacoesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTerminalTransacoesResponse>>(){}.getType();
    }
    
    if ("TipoTransacaoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoTransacaoAjusteResponse>>(){}.getType();
    }
    
    if ("TipoVinculoContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoVinculoContaPersist>>(){}.getType();
    }
    
    if ("TipoVinculoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TipoVinculoContaResponse>>(){}.getType();
    }
    
    if ("TokenCartaoPartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenCartaoPartialUpdate>>(){}.getType();
    }
    
    if ("TokenCartaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenCartaoPersist>>(){}.getType();
    }
    
    if ("TokenCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenCartaoResponse>>(){}.getType();
    }
    
    if ("TokenCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenCartaoUpdate>>(){}.getType();
    }
    
    if ("TransacaoCorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoCorrenteResponse>>(){}.getType();
    }
    
    if ("TransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoNaoProcessadaResponse>>(){}.getType();
    }
    
    if ("TransacaoNegadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransacaoNegadaResponse>>(){}.getType();
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
    
    if ("TransferenciaCreditoContaBancariaListaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaCreditoContaBancariaListaResponse>>(){}.getType();
    }
    
    if ("TransferenciaCreditoContaBancariaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaCreditoContaBancariaPersist>>(){}.getType();
    }
    
    if ("TransferenciaCreditoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaCreditoContaBancariaResponse>>(){}.getType();
    }
    
    if ("TransferenciaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaDetalheResponse>>(){}.getType();
    }
    
    if ("TransferenciaPortadoresPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaPortadoresPersist>>(){}.getType();
    }
    
    if ("TransferenciaPortadoresResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaPortadoresResponse>>(){}.getType();
    }
    
    if ("TransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferenciaResponse>>(){}.getType();
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
    
    if ("UsuarioToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioToken>>(){}.getType();
    }
    
    if ("UsuarioTokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioTokenResponse>>(){}.getType();
    }
    
    if ("UsuarioUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioUpdate>>(){}.getType();
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
    
    if ("VinculoContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<List<VinculoContaPersist>>(){}.getType();
    }
    
    if ("VinculoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<VinculoContaResponse>>(){}.getType();
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
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AcordoBoletoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<AcordoBoletoPersist>(){}.getType();
    }
    
    if ("AcordoDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AcordoDetalheResponse>(){}.getType();
    }
    
    if ("AcordoEmailRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AcordoEmailRequest>(){}.getType();
    }
    
    if ("AcordoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<AcordoPersist>(){}.getType();
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
    
    if ("AdesaoPacoteTarifaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<AdesaoPacoteTarifaUpdate>(){}.getType();
    }
    
    if ("AdesaoPagamentoSabadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AdesaoPagamentoSabadoResponse>(){}.getType();
    }
    
    if ("AdesaoServicoPartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<AdesaoServicoPartialUpdate>(){}.getType();
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
    
    if ("AjustePersist".equalsIgnoreCase(className)) {
      return new TypeToken<AjustePersist>(){}.getType();
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
    
    if ("AplicacaoMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobilePersist>(){}.getType();
    }
    
    if ("AplicacaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobileResponse>(){}.getType();
    }
    
    if ("AplicacaoMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<AplicacaoMobileUpdate>(){}.getType();
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
    
    if ("AtribuirCartaoPessoaRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AtribuirCartaoPessoaRequest>(){}.getType();
    }
    
    if ("AutorizacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AutorizacaoOnUsRequest>(){}.getType();
    }
    
    if ("AutorizacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AutorizacaoResponse>(){}.getType();
    }
    
    if ("AvisoViagemResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AvisoViagemResponse>(){}.getType();
    }
    
    if ("BancoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<BancoPersist>(){}.getType();
    }
    
    if ("BancoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BancoResponse>(){}.getType();
    }
    
    if ("BancoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<BancoUpdate>(){}.getType();
    }
    
    if ("BeneficioPagamentoAtrasoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BeneficioPagamentoAtrasoResponse>(){}.getType();
    }
    
    if ("BeneficioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<BeneficioPersist>(){}.getType();
    }
    
    if ("BeneficioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BeneficioResponse>(){}.getType();
    }
    
    if ("BeneficioUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<BeneficioUpdate>(){}.getType();
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
    
    if ("CampanhaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CampanhaPersist>(){}.getType();
    }
    
    if ("CampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CampanhaResponse>(){}.getType();
    }
    
    if ("CampanhaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<CampanhaUpdate>(){}.getType();
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
    
    if ("CartaoEmissorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoEmissorResponse>(){}.getType();
    }
    
    if ("CartaoImpressaoProvisorioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoImpressaoProvisorioResponse>(){}.getType();
    }
    
    if ("CartaoImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoImpressaoResponse>(){}.getType();
    }
    
    if ("CartaoLoteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoLoteResponse>(){}.getType();
    }
    
    if ("CartaoMifareRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoMifareRequest>(){}.getType();
    }
    
    if ("CartaoMultiAppImpressaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoMultiAppImpressaoResponse>(){}.getType();
    }
    
    if ("CartaoMultiAppPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoMultiAppPersist>(){}.getType();
    }
    
    if ("CartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoResponse>(){}.getType();
    }
    
    if ("CartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<CartaoUpdate>(){}.getType();
    }
    
    if ("CdtAutorizacao".equalsIgnoreCase(className)) {
      return new TypeToken<CdtAutorizacao>(){}.getType();
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
    
    if ("CdtEventoExternoCompra".equalsIgnoreCase(className)) {
      return new TypeToken<CdtEventoExternoCompra>(){}.getType();
    }
    
    if ("CdtTipoContaBancaria".equalsIgnoreCase(className)) {
      return new TypeToken<CdtTipoContaBancaria>(){}.getType();
    }
    
    if ("CdtTipoOperacao".equalsIgnoreCase(className)) {
      return new TypeToken<CdtTipoOperacao>(){}.getType();
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
    
    if ("ConfiguracaoControleCartaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoControleCartaoPersist>(){}.getType();
    }
    
    if ("ConfiguracaoControleCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoControleCartaoResponse>(){}.getType();
    }
    
    if ("ConfiguracaoControleCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoControleCartaoUpdate>(){}.getType();
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
    
    if ("ConfiguracaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConfiguracaoSMSResponse>(){}.getType();
    }
    
    if ("ConsultaCadastroEstabelecimentoDTO".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultaCadastroEstabelecimentoDTO>(){}.getType();
    }
    
    if ("ConsultarSenhaCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConsultarSenhaCartaoResponse>(){}.getType();
    }
    
    if ("ContaAtribuirCartaoPrePagoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ContaAtribuirCartaoPrePagoRequest>(){}.getType();
    }
    
    if ("ContaBancariaPortadorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ContaBancariaPortadorPersist>(){}.getType();
    }
    
    if ("ContaBancariaPortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaBancariaPortadorResponse>(){}.getType();
    }
    
    if ("ContaBancariaPortadorUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ContaBancariaPortadorUpdate>(){}.getType();
    }
    
    if ("ContaDebitoRecorrente".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDebitoRecorrente>(){}.getType();
    }
    
    if ("ContaDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDebitoRecorrenteResponse>(){}.getType();
    }
    
    if ("ContaDebitoTarifaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDebitoTarifaPersist>(){}.getType();
    }
    
    if ("ContaDebitoTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDebitoTarifaResponse>(){}.getType();
    }
    
    if ("ContaDebitoTarifaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDebitoTarifaUpdate>(){}.getType();
    }
    
    if ("ContaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaDetalheResponse>(){}.getType();
    }
    
    if ("ContaHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ContaHistoricoPagamentoResponse>(){}.getType();
    }
    
    if ("ContaMultiAppPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ContaMultiAppPersist>(){}.getType();
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
    
    if ("ControleCartaoGrupoMCCPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ControleCartaoGrupoMCCPersist>(){}.getType();
    }
    
    if ("ControleCartaoGrupoMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ControleCartaoGrupoMCCResponse>(){}.getType();
    }
    
    if ("ControleLimiteCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ControleLimiteCartaoResponse>(){}.getType();
    }
    
    if ("ControleLimiteCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ControleLimiteCartaoUpdate>(){}.getType();
    }
    
    if ("ControleLimitesCartaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ControleLimitesCartaoPersist>(){}.getType();
    }
    
    if ("ControleSegurancaDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ControleSegurancaDispositivoResponse>(){}.getType();
    }
    
    if ("ControleSubcontaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ControleSubcontaPersist>(){}.getType();
    }
    
    if ("ControleSubcontaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ControleSubcontaResponse>(){}.getType();
    }
    
    if ("ControleSubcontaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ControleSubcontaUpdate>(){}.getType();
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
    
    if ("CotacaoDolarResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CotacaoDolarResponse>(){}.getType();
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
    
    if ("CvvDinamicoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<CvvDinamicoPersist>(){}.getType();
    }
    
    if ("CvvDinamicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CvvDinamicoResponse>(){}.getType();
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
    
    if ("DesfazimentoTransacaoOnUsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<DesfazimentoTransacaoOnUsRequest>(){}.getType();
    }
    
    if ("DetalheOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalheOperacaoResponse>(){}.getType();
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
    
    if ("DetalhesExtratoTarifasResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DetalhesExtratoTarifasResponse>(){}.getType();
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
    
    if ("EnderecoAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoAprovadoPersist>(){}.getType();
    }
    
    if ("EnderecoAprovadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EnderecoAprovadoResponse>(){}.getType();
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
    
    if ("EventoExternoCompraParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<EventoExternoCompraParcialUpdate>(){}.getType();
    }
    
    if ("EventoExternoCompraPersist".equalsIgnoreCase(className)) {
      return new TypeToken<EventoExternoCompraPersist>(){}.getType();
    }
    
    if ("EventoExternoCompraResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EventoExternoCompraResponse>(){}.getType();
    }
    
    if ("ExtratoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ExtratoResponse>(){}.getType();
    }
    
    if ("ExtratoTarifasResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ExtratoTarifasResponse>(){}.getType();
    }
    
    if ("FantasiaBasicaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<FantasiaBasicaPersist>(){}.getType();
    }
    
    if ("FantasiaBasicaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FantasiaBasicaResponse>(){}.getType();
    }
    
    if ("FaqResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaqResponse>(){}.getType();
    }
    
    if ("FaturaAbertaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaAbertaResponse>(){}.getType();
    }
    
    if ("FaturaConsignadaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaConsignadaDetalheResponse>(){}.getType();
    }
    
    if ("FaturaConsignadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaConsignadaResponse>(){}.getType();
    }
    
    if ("FaturaConsolidadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaConsolidadaResponse>(){}.getType();
    }
    
    if ("FaturaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaDetalheResponse>(){}.getType();
    }
    
    if ("FaturaFechadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaFechadaResponse>(){}.getType();
    }
    
    if ("FaturaFuturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FaturaFuturaResponse>(){}.getType();
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
    
    if ("GrupoEstabelecimentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoEstabelecimentoPersist>(){}.getType();
    }
    
    if ("GrupoEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoEstabelecimentoResponse>(){}.getType();
    }
    
    if ("GrupoEstabelecimentoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoEstabelecimentoUpdate>(){}.getType();
    }
    
    if ("GrupoMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoMCCResponse>(){}.getType();
    }
    
    if ("GrupoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoOrigemComercialResponse>(){}.getType();
    }
    
    if ("GrupoTransacaoLojistaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GrupoTransacaoLojistaResponse>(){}.getType();
    }
    
    if ("HistoricoAssessoriaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoAssessoriaResponse>(){}.getType();
    }
    
    if ("HistoricoAtrasoFaturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoAtrasoFaturaResponse>(){}.getType();
    }
    
    if ("HistoricoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<HistoricoEnderecoResponse>(){}.getType();
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
    
    if ("IndicacaoAmigoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<IndicacaoAmigoPersist>(){}.getType();
    }
    
    if ("IndicacaoAmigoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<IndicacaoAmigoResponse>(){}.getType();
    }
    
    if ("IndicacaoAmigoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<IndicacaoAmigoUpdate>(){}.getType();
    }
    
    if ("InscricaoAPN".equalsIgnoreCase(className)) {
      return new TypeToken<InscricaoAPN>(){}.getType();
    }
    
    if ("InscricaoAPNResponse".equalsIgnoreCase(className)) {
      return new TypeToken<InscricaoAPNResponse>(){}.getType();
    }
    
    if ("InstituicaoPagamentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<InstituicaoPagamentoPersist>(){}.getType();
    }
    
    if ("InstituicaoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<InstituicaoPagamentoResponse>(){}.getType();
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
    
    if ("LimiteDisponibilidadeLogResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LimiteDisponibilidadeLogResponse>(){}.getType();
    }
    
    if ("LimiteDisponibilidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LimiteDisponibilidadeResponse>(){}.getType();
    }
    
    if ("LimitePortadorPersist".equalsIgnoreCase(className)) {
      return new TypeToken<LimitePortadorPersist>(){}.getType();
    }
    
    if ("LimitePortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LimitePortadorResponse>(){}.getType();
    }
    
    if ("LogAcessoUsuarioPersist".equalsIgnoreCase(className)) {
      return new TypeToken<LogAcessoUsuarioPersist>(){}.getType();
    }
    
    if ("LogAcessoUsuarioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LogAcessoUsuarioResponse>(){}.getType();
    }
    
    if ("LogRequisicaoMobilePartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<LogRequisicaoMobilePartialUpdate>(){}.getType();
    }
    
    if ("LogRequisicaoMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<LogRequisicaoMobilePersist>(){}.getType();
    }
    
    if ("LogRequisicaoMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LogRequisicaoMobileResponse>(){}.getType();
    }
    
    if ("LoteCartaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<LoteCartaoPersist>(){}.getType();
    }
    
    if ("LoteCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LoteCartaoResponse>(){}.getType();
    }
    
    if ("LoteCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<LoteCartaoUpdate>(){}.getType();
    }
    
    if ("LoteCartoesPrePagosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LoteCartoesPrePagosResponse>(){}.getType();
    }
    
    if ("MCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MCCResponse>(){}.getType();
    }
    
    if ("MapOfstringAndobject".equalsIgnoreCase(className)) {
      return new TypeToken<MapOfstringAndobject>(){}.getType();
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
    
    if ("MotivoFraudePersist".equalsIgnoreCase(className)) {
      return new TypeToken<MotivoFraudePersist>(){}.getType();
    }
    
    if ("MotivoFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MotivoFraudeResponse>(){}.getType();
    }
    
    if ("MotivoFraudeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<MotivoFraudeUpdate>(){}.getType();
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
    
    if ("NotificacaoSMSBody".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoSMSBody>(){}.getType();
    }
    
    if ("NotificacaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<NotificacaoSMSResponse>(){}.getType();
    }
    
    if ("ObjetoPessoaFsicaAprovada".equalsIgnoreCase(className)) {
      return new TypeToken<ObjetoPessoaFsicaAprovada>(){}.getType();
    }
    
    if ("ObjetoPessoaFsicaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ObjetoPessoaFsicaAprovadaResponse>(){}.getType();
    }
    
    if ("OperacaoBancariaParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<OperacaoBancariaParcialUpdate>(){}.getType();
    }
    
    if ("OperacaoBancariaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<OperacaoBancariaPersist>(){}.getType();
    }
    
    if ("OperacaoBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OperacaoBancariaResponse>(){}.getType();
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
    
    if ("OportunidadePersist".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadePersist>(){}.getType();
    }
    
    if ("OportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadeResponse>(){}.getType();
    }
    
    if ("OportunidadeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<OportunidadeUpdate>(){}.getType();
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
    
    if ("PacoteTarifaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PacoteTarifaPersist>(){}.getType();
    }
    
    if ("PacoteTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PacoteTarifaResponse>(){}.getType();
    }
    
    if ("PacoteTarifaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PacoteTarifaUpdate>(){}.getType();
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
    
    if ("PageBeneficioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageBeneficioResponse>(){}.getType();
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
    
    if ("PageCartaoLoteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCartaoLoteResponse>(){}.getType();
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
    
    if ("PageConfiguracaoControleCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConfiguracaoControleCartaoResponse>(){}.getType();
    }
    
    if ("PageConfiguracaoEmailResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConfiguracaoEmailResponse>(){}.getType();
    }
    
    if ("PageConfiguracaoRotativoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConfiguracaoRotativoResponse>(){}.getType();
    }
    
    if ("PageConfiguracaoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConfiguracaoSMSResponse>(){}.getType();
    }
    
    if ("PageContaBancariaPortadorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageContaBancariaPortadorResponse>(){}.getType();
    }
    
    if ("PageContaDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageContaDebitoRecorrenteResponse>(){}.getType();
    }
    
    if ("PageContaDebitoTarifaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageContaDebitoTarifaResponse>(){}.getType();
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
    
    if ("PageControleCartaoGrupoMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageControleCartaoGrupoMCCResponse>(){}.getType();
    }
    
    if ("PageControleLimiteCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageControleLimiteCartaoResponse>(){}.getType();
    }
    
    if ("PageControleSegurancaDispositivoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageControleSegurancaDispositivoResponse>(){}.getType();
    }
    
    if ("PageControleSubcontaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageControleSubcontaResponse>(){}.getType();
    }
    
    if ("PageControleVencimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageControleVencimentoResponse>(){}.getType();
    }
    
    if ("PageConvenioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageConvenioResponse>(){}.getType();
    }
    
    if ("PageCotacaoDolarResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCotacaoDolarResponse>(){}.getType();
    }
    
    if ("PageCredorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageCredorResponse>(){}.getType();
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
    
    if ("PageExtratoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageExtratoResponse>(){}.getType();
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
    
    if ("PageFaturaConsolidadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturaConsolidadaResponse>(){}.getType();
    }
    
    if ("PageFaturaFechadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturaFechadaResponse>(){}.getType();
    }
    
    if ("PageFaturaFuturaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageFaturaFuturaResponse>(){}.getType();
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
    
    if ("PageGrupoEstabelecimentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageGrupoEstabelecimentoResponse>(){}.getType();
    }
    
    if ("PageGrupoMCCResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageGrupoMCCResponse>(){}.getType();
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
    
    if ("PageHistoricoEnderecoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoEnderecoResponse>(){}.getType();
    }
    
    if ("PageHistoricoEventosResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoEventosResponse>(){}.getType();
    }
    
    if ("PageHistoricoPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageHistoricoPagamentoResponse>(){}.getType();
    }
    
    if ("PageIndicacaoAmigoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageIndicacaoAmigoResponse>(){}.getType();
    }
    
    if ("PageInscricaoAPNResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageInscricaoAPNResponse>(){}.getType();
    }
    
    if ("PageInstituicoesPagamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageInstituicoesPagamentoResponse>(){}.getType();
    }
    
    if ("PageLoteCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageLoteCartaoResponse>(){}.getType();
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
    
    if ("PageMotivoFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageMotivoFraudeResponse>(){}.getType();
    }
    
    if ("PageOperacaoBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageOperacaoBancariaResponse>(){}.getType();
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
    
    if ("PagePIEROfLimiteDisponibilidadeLogResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePIEROfLimiteDisponibilidadeLogResponse>(){}.getType();
    }
    
    if ("PagePaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePaisResponse>(){}.getType();
    }
    
    if ("PageParametroAcumuladorContaOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageParametroAcumuladorContaOperacaoResponse>(){}.getType();
    }
    
    if ("PageParametroAcumuladorProdutoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageParametroAcumuladorProdutoOperacaoResponse>(){}.getType();
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
    
    if ("PagePortadorDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PagePortadorDebitoRecorrenteResponse>(){}.getType();
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
    
    if ("PageProjecaoCompraNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageProjecaoCompraNaoProcessadaResponse>(){}.getType();
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
    
    if ("PageRecargaCelularFavoritoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageRecargaCelularFavoritoResponse>(){}.getType();
    }
    
    if ("PageRelatorioMovimentosControleProcessos".equalsIgnoreCase(className)) {
      return new TypeToken<PageRelatorioMovimentosControleProcessos>(){}.getType();
    }
    
    if ("PageSMSContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageSMSContaResponse>(){}.getType();
    }
    
    if ("PageSMSEnvioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageSMSEnvioResponse>(){}.getType();
    }
    
    if ("PageSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageSMSResponse>(){}.getType();
    }
    
    if ("PageSegurancaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageSegurancaMobileResponse>(){}.getType();
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
    
    if ("PageStatusCnabSumarizadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageStatusCnabSumarizadoResponse>(){}.getType();
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
    
    if ("PageSuspeitaFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageSuspeitaFraudeResponse>(){}.getType();
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
    
    if ("PageTipoBeneficioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoBeneficioResponse>(){}.getType();
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
    
    if ("PageTipoOperacaoBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoOperacaoBancariaResponse>(){}.getType();
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
    
    if ("PageTipoPlasticoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoPlasticoResponse>(){}.getType();
    }
    
    if ("PageTipoResolucaoContestacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoResolucaoContestacaoResponse>(){}.getType();
    }
    
    if ("PageTipoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoServicoResponse>(){}.getType();
    }
    
    if ("PageTipoServicoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoServicoSMSResponse>(){}.getType();
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
    
    if ("PageTipoTerminalTransacoesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoTerminalTransacoesResponse>(){}.getType();
    }
    
    if ("PageTipoVinculoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTipoVinculoContaResponse>(){}.getType();
    }
    
    if ("PageTiposOperacoesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTiposOperacoesResponse>(){}.getType();
    }
    
    if ("PageTokenCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTokenCartaoResponse>(){}.getType();
    }
    
    if ("PageTransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacaoNaoProcessadaResponse>(){}.getType();
    }
    
    if ("PageTransacaoNegadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageTransacaoNegadaResponse>(){}.getType();
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
    
    if ("PageVinculoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageVinculoContaResponse>(){}.getType();
    }
    
    if ("PageVinculoEstabelecimentoAdquirenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageVinculoEstabelecimentoAdquirenteResponse>(){}.getType();
    }
    
    if ("PageVinculoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PageVinculoOperacaoResponse>(){}.getType();
    }
    
    if ("PaisResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PaisResponse>(){}.getType();
    }
    
    if ("ParametroAcumuladorContaOperacaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroAcumuladorContaOperacaoPersist>(){}.getType();
    }
    
    if ("ParametroAcumuladorContaOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroAcumuladorContaOperacaoResponse>(){}.getType();
    }
    
    if ("ParametroAcumuladorContaOperacaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroAcumuladorContaOperacaoUpdate>(){}.getType();
    }
    
    if ("ParametroAcumuladorProdutoOperacaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroAcumuladorProdutoOperacaoPersist>(){}.getType();
    }
    
    if ("ParametroAcumuladorProdutoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroAcumuladorProdutoOperacaoResponse>(){}.getType();
    }
    
    if ("ParametroAcumuladorProdutoOperacaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<ParametroAcumuladorProdutoOperacaoUpdate>(){}.getType();
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
    
    if ("ParcelamentoAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParcelamentoAcordoResponse>(){}.getType();
    }
    
    if ("ParcelamentoTransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ParcelamentoTransferenciaResponse>(){}.getType();
    }
    
    if ("PessoaDetalhePartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PessoaDetalhePartialUpdate>(){}.getType();
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
    
    if ("PlanoCampanhaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoCampanhaPersist>(){}.getType();
    }
    
    if ("PlanoCampanhaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoCampanhaResponse>(){}.getType();
    }
    
    if ("PlanoCampanhaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoCampanhaUpdate>(){}.getType();
    }
    
    if ("PlanoParcelamentoAcordoRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoParcelamentoAcordoRequest>(){}.getType();
    }
    
    if ("PlanoParcelamentoAcordoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanoParcelamentoAcordoResponse>(){}.getType();
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
    
    if ("PlataformaMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobilePersist>(){}.getType();
    }
    
    if ("PlataformaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobileResponse>(){}.getType();
    }
    
    if ("PlataformaMobileUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PlataformaMobileUpdate>(){}.getType();
    }
    
    if ("PortadorDebitoRecorrentePersist".equalsIgnoreCase(className)) {
      return new TypeToken<PortadorDebitoRecorrentePersist>(){}.getType();
    }
    
    if ("PortadorDebitoRecorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PortadorDebitoRecorrenteResponse>(){}.getType();
    }
    
    if ("PortadorDebitoRecorrenteUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PortadorDebitoRecorrenteUpdate>(){}.getType();
    }
    
    if ("PortadorParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<PortadorParcialUpdate>(){}.getType();
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
    
    if ("ProjecaoCompraNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProjecaoCompraNaoProcessadaResponse>(){}.getType();
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
    
    if ("PushFCMEGCM".equalsIgnoreCase(className)) {
      return new TypeToken<PushFCMEGCM>(){}.getType();
    }
    
    if ("QuitacaoAnualResponse".equalsIgnoreCase(className)) {
      return new TypeToken<QuitacaoAnualResponse>(){}.getType();
    }
    
    if ("RecargaCelularFavoritoParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<RecargaCelularFavoritoParcialUpdate>(){}.getType();
    }
    
    if ("RecargaCelularFavoritoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<RecargaCelularFavoritoPersist>(){}.getType();
    }
    
    if ("RecargaCelularFavoritoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RecargaCelularFavoritoResponse>(){}.getType();
    }
    
    if ("ReferenciaComercialAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<ReferenciaComercialAprovadoPersist>(){}.getType();
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
    
    if ("RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta".equalsIgnoreCase(className)) {
      return new TypeToken<RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta>(){}.getType();
    }
    
    if ("SMSContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<SMSContaPersist>(){}.getType();
    }
    
    if ("SMSContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SMSContaResponse>(){}.getType();
    }
    
    if ("SMSEnvioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SMSEnvioResponse>(){}.getType();
    }
    
    if ("Secure3dRequest".equalsIgnoreCase(className)) {
      return new TypeToken<Secure3dRequest>(){}.getType();
    }
    
    if ("SegurancaMobileParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<SegurancaMobileParcialUpdate>(){}.getType();
    }
    
    if ("SegurancaMobilePersist".equalsIgnoreCase(className)) {
      return new TypeToken<SegurancaMobilePersist>(){}.getType();
    }
    
    if ("SegurancaMobileResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SegurancaMobileResponse>(){}.getType();
    }
    
    if ("SenhaDTO".equalsIgnoreCase(className)) {
      return new TypeToken<SenhaDTO>(){}.getType();
    }
    
    if ("SenhaForte".equalsIgnoreCase(className)) {
      return new TypeToken<SenhaForte>(){}.getType();
    }
    
    if ("SensibilizarSaldoGlobalUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<SensibilizarSaldoGlobalUpdate>(){}.getType();
    }
    
    if ("ServicoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ServicoContaResponse>(){}.getType();
    }
    
    if ("SocioAprovadoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<SocioAprovadoPersist>(){}.getType();
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
    
    if ("StatusCnabSumarizadoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusCnabSumarizadoResponse>(){}.getType();
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
    
    if ("StatusOportunidade".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOportunidade>(){}.getType();
    }
    
    if ("StatusOportunidadeAUDResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOportunidadeAUDResponse>(){}.getType();
    }
    
    if ("StatusOportunidadeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusOportunidadeResponse>(){}.getType();
    }
    
    if ("StatusPropostaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<StatusPropostaResponse>(){}.getType();
    }
    
    if ("StatusPropostaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<StatusPropostaUpdate>(){}.getType();
    }
    
    if ("SuspeitaFraudePersist".equalsIgnoreCase(className)) {
      return new TypeToken<SuspeitaFraudePersist>(){}.getType();
    }
    
    if ("SuspeitaFraudeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SuspeitaFraudeResponse>(){}.getType();
    }
    
    if ("SuspeitaFraudeUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<SuspeitaFraudeUpdate>(){}.getType();
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
    
    if ("TaxaJurosContaUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TaxaJurosContaUpdate>(){}.getType();
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
    
    if ("TelefonePessoaAprovadaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TelefonePessoaAprovadaPersist>(){}.getType();
    }
    
    if ("TelefonePessoaAprovadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TelefonePessoaAprovadaResponse>(){}.getType();
    }
    
    if ("TelefoneResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TelefoneResponse>(){}.getType();
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
    
    if ("TipoBeneficioResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoBeneficioResponse>(){}.getType();
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
    
    if ("TipoFaturamentoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TipoFaturamentoPersist>(){}.getType();
    }
    
    if ("TipoFaturamentoPorContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TipoFaturamentoPorContaPersist>(){}.getType();
    }
    
    if ("TipoFaturamentoPorContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoFaturamentoPorContaResponse>(){}.getType();
    }
    
    if ("TipoFaturamentoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoFaturamentoResponse>(){}.getType();
    }
    
    if ("TipoFuncaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoFuncaoResponse>(){}.getType();
    }
    
    if ("TipoOperacaoBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOperacaoBancariaResponse>(){}.getType();
    }
    
    if ("TipoOperacaoParcialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOperacaoParcialUpdate>(){}.getType();
    }
    
    if ("TipoOperacaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOperacaoResponse>(){}.getType();
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
    
    if ("TipoOrigemComercialResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoOrigemComercialResponse>(){}.getType();
    }
    
    if ("TipoPlasticoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TipoPlasticoPersist>(){}.getType();
    }
    
    if ("TipoPlasticoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoPlasticoResponse>(){}.getType();
    }
    
    if ("TipoServicoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoServicoResponse>(){}.getType();
    }
    
    if ("TipoServicoSMSResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoServicoSMSResponse>(){}.getType();
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
    
    if ("TipoTerminalTransacoesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTerminalTransacoesResponse>(){}.getType();
    }
    
    if ("TipoTransacaoAjusteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoTransacaoAjusteResponse>(){}.getType();
    }
    
    if ("TipoVinculoContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TipoVinculoContaPersist>(){}.getType();
    }
    
    if ("TipoVinculoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TipoVinculoContaResponse>(){}.getType();
    }
    
    if ("TokenCartaoPartialUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TokenCartaoPartialUpdate>(){}.getType();
    }
    
    if ("TokenCartaoPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TokenCartaoPersist>(){}.getType();
    }
    
    if ("TokenCartaoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TokenCartaoResponse>(){}.getType();
    }
    
    if ("TokenCartaoUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<TokenCartaoUpdate>(){}.getType();
    }
    
    if ("TransacaoCorrenteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoCorrenteResponse>(){}.getType();
    }
    
    if ("TransacaoNaoProcessadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoNaoProcessadaResponse>(){}.getType();
    }
    
    if ("TransacaoNegadaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransacaoNegadaResponse>(){}.getType();
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
    
    if ("TransferenciaCreditoContaBancariaListaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaCreditoContaBancariaListaResponse>(){}.getType();
    }
    
    if ("TransferenciaCreditoContaBancariaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaCreditoContaBancariaPersist>(){}.getType();
    }
    
    if ("TransferenciaCreditoContaBancariaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaCreditoContaBancariaResponse>(){}.getType();
    }
    
    if ("TransferenciaDetalheResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaDetalheResponse>(){}.getType();
    }
    
    if ("TransferenciaPortadoresPersist".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaPortadoresPersist>(){}.getType();
    }
    
    if ("TransferenciaPortadoresResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaPortadoresResponse>(){}.getType();
    }
    
    if ("TransferenciaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferenciaResponse>(){}.getType();
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
    
    if ("UsuarioToken".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioToken>(){}.getType();
    }
    
    if ("UsuarioTokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioTokenResponse>(){}.getType();
    }
    
    if ("UsuarioUpdate".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioUpdate>(){}.getType();
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
    
    if ("VinculoContaPersist".equalsIgnoreCase(className)) {
      return new TypeToken<VinculoContaPersist>(){}.getType();
    }
    
    if ("VinculoContaResponse".equalsIgnoreCase(className)) {
      return new TypeToken<VinculoContaResponse>(){}.getType();
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
    
    return new TypeToken<Object>(){}.getType();
  }

};
