package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AjusteFinanceiroResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.AlterarProdutoRequest;
import br.com.conductor.pier.api.v2.model.ContaResponse;
import br.com.conductor.pier.api.v2.model.ContaAtribuirCartaoPrePagoRequest;
import br.com.conductor.pier.api.v2.model.AdesaoServicoPartialUpdate;
import br.com.conductor.pier.api.v2.model.AdesaoServicoResponse;
import br.com.conductor.pier.api.v2.model.ContaPartialUpdate;
import br.com.conductor.pier.api.v2.model.SegurancaMobileResponse;
import br.com.conductor.pier.api.v2.model.SegurancaMobileParcialUpdate;
import br.com.conductor.pier.api.v2.model.AdesaoPagamentoSabadoResponse;
import br.com.conductor.pier.api.v2.model.SegurancaMobilePersist;
import br.com.conductor.pier.api.v2.model.ExtratoTarifasResponse;
import br.com.conductor.pier.api.v2.model.BeneficioPagamentoAtrasoResponse;
import br.com.conductor.pier.api.v2.model.BoletoResponse;
import br.com.conductor.pier.api.v2.model.DividaClienteResponse;
import br.com.conductor.pier.api.v2.model.PageParcelaAgendamentoResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageTaxasRefinanciamentoResponse;
import br.com.conductor.pier.api.v2.model.ContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageExtratoResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaDetalheResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppPersist;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingRequest;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoProvisorioResponse;
import br.com.conductor.pier.api.v2.model.PageContaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoEventosResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAssessoriaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAtrasoFaturaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageSegurancaMobileResponse;
import br.com.conductor.pier.api.v2.model.PageProjecaoCompraNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoProcessadaNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaResponse;
import br.com.conductor.pier.api.v2.model.ContaPersist;
import br.com.conductor.pier.api.v2.model.AdesaoServicoPersist;
import br.com.conductor.pier.api.v2.model.AgendamentoPersist;
import br.com.conductor.pier.api.v2.model.AgendamentoResponse;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalRequest;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaPortadoresResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaPortadoresPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ContaApi {
  String basePath = "http://localhost/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Lan\u00E7a um ajuste para a conta do id informado
   * Este recurso insere um ajuste para a conta do id informado
   * @param id Id Conta
   * @param idTipoAjuste C\u00F3digo identificador do tipo de ajuste
   * @param dataAjuste Data do ajuste no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @param valorAjuste Valor do ajuste
   * @param login login
   * @param identificadorExterno Identificador Externo
   * @param idTransacaoOriginal Identificador da transa\u00E7\u00E3o original (estorno)
   * @param idEstabelecimento Identificador do estabelecimento quando o pagamento for efetuado em loja
   * @param flagAtendimento Flag para lan\u00E7ar o atendimento
   * @param mensagemAtendimento Mensagem enviada no atendimento
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  ajustarConta (Long id, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String login, String identificadorExterno, Long idTransacaoOriginal, Long idEstabelecimento, Boolean flagAtendimento, String mensagemAtendimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ajustarConta");
    }
    
    // verify the required parameter 'idTipoAjuste' is set
    if (idTipoAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling ajustarConta");
    }
    
    // verify the required parameter 'dataAjuste' is set
    if (dataAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling ajustarConta");
    }
    
    // verify the required parameter 'valorAjuste' is set
    if (valorAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling ajustarConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/ajustes-financeiros".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTransacaoOriginal", idTransacaoOriginal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtendimento", flagAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "mensagemAtendimento", mensagemAtendimento));
    

    
    headerParams.put("login", ApiInvoker.parameterToString(login));
    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AjusteFinanceiroResponse) ApiInvoker.deserialize(response, "", AjusteFinanceiroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Altera o produto associado \u00E0 conta
   * O recurso permite fazer modifica\u00E7\u00E3o do produto associado \u00E0 conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param request request
   * @return String
   */
  public String  alterarProduto (Long id, AlterarProdutoRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarProduto");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling alterarProduto");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/alterar-produto".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a altera\u00E7\u00E3o de uma Pessoa tilular da conta
   * Esta m\u00E9todo permite altera a pessoa de uma conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id)
   * @param idPessoa C\u00F3digo de identifica\u00E7\u00E3o de uma Pessoa (id)
   * @return ContaResponse
   */
  public ContaResponse  alterarTitular (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTitular");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterarTitular");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/alterar-titular".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_pessoa", idPessoa));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a altera\u00E7\u00E3o do dia de vencimento das faturas da conta
   * Esse recurso permite alterar o vencimento para no m\u00E1ximo at\u00E9 30 dias ap\u00F3s data atual de uma conta especifica no PIER, respeitando o par\u00E2metro de intervalor entre as modifica\u00E7\u00F5es do vencimento informado pelo emissor
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param novoDiaVencimento Novo dia de vencimento
   * @return ContaResponse
   */
  public ContaResponse  alterarVencimento (Long id, Integer novoDiaVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarVencimento");
    }
    
    // verify the required parameter 'novoDiaVencimento' is set
    if (novoDiaVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'novoDiaVencimento' when calling alterarVencimento");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/alterar-vencimento".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "novo_dia_vencimento", novoDiaVencimento));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atribuir Anuidade
   * Esse recurso permite configurar qual a regra de Anuidade que ser\u00E1 atribu\u00EDda a uma determinada Conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param idAnuidade Identificador da anuidade
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param DDD DDD do celular
   * @param celular N\u00FAmero do celular
   * @param idOperadora Identificador da operadora do celular
   * @param idOrigemComercial Identificador da origem comercial
   * @return Object
   */
  public Object  ativarAnuidade (Long id, Long idAnuidade, List<String> sort, Integer page, Integer limit, String DDD, String celular, Long idOperadora, Long idOrigemComercial) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarAnuidade");
    }
    
    // verify the required parameter 'idAnuidade' is set
    if (idAnuidade == null) {
       throw new ApiException(400, "Missing the required parameter 'idAnuidade' when calling ativarAnuidade");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/atribuir-anuidade".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idAnuidade", idAnuidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "DDD", DDD));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "celular", celular));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperadora", idOperadora));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Ativa o servi\u00E7o de envio de fatura por email
   * Este recurso ativa o servi\u00E7o de envio de fatura por email
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return Object
   */
  public Object  ativarEnvioFaturaEmail (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling ativarEnvioFaturaEmail");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/ativar-fatura-email".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a atribui\u00E7\u00E3o de um cart\u00E3o pr\u00E9-pago a uma conta
   * Este m\u00E9todo permite que um cart\u00E3o pr\u00E9-pago impresso de forma avulsa e an\u00F4nimo seja atribu\u00EDdo a uma conta, tornando-a portadora dele.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o de uma Conta (id).
   * @param contaAtribuirCartaoRequest contaAtribuirCartaoRequest
   * @return String
   */
  public String  atribuirCartaoPrePago (Long id, ContaAtribuirCartaoPrePagoRequest contaAtribuirCartaoRequest) throws ApiException {
    Object postBody = contaAtribuirCartaoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirCartaoPrePago");
    }
    
    // verify the required parameter 'contaAtribuirCartaoRequest' is set
    if (contaAtribuirCartaoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'contaAtribuirCartaoRequest' when calling atribuirCartaoPrePago");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/atribuir-cartao-prepago".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza uma atualiza\u00E7\u00E3o parcial da ades\u00E3o do servi\u00E7o
   * Este recurso permite atualizar parcialmente uma ades\u00E3o de servi\u00E7o existente na base do emissor
   * @param id Identificador da conta para atualiza\u00E7\u00E3o da ades\u00E3o parcial
   * @param adesaoServicoUpdate adesaoServicoUpdate
   * @return AdesaoServicoResponse
   */
  public AdesaoServicoResponse  atualizarAdesaoServicosParcial (Long id, AdesaoServicoPartialUpdate adesaoServicoUpdate) throws ApiException {
    Object postBody = adesaoServicoUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarAdesaoServicosParcial");
    }
    
    // verify the required parameter 'adesaoServicoUpdate' is set
    if (adesaoServicoUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'adesaoServicoUpdate' when calling atualizarAdesaoServicosParcial");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adesoes-servicos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdesaoServicoResponse) ApiInvoker.deserialize(response, "", AdesaoServicoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a atualiza\u00E7\u00E3o parcial da conta
   * Esse recurso permite realizar a atualiza\u00E7\u00E3o parcial da conta. Isso indica dizer que apenas os campos informados na requisi\u00E7\u00E3o ser\u00E3o atualizados, sendo ignorados os demais
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param contaPartialUpdate contaPartialUpdate
   * @return ContaResponse
   */
  public ContaResponse  atualizarParcial (Long id, ContaPartialUpdate contaPartialUpdate) throws ApiException {
    Object postBody = contaPartialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcial");
    }
    
    // verify the required parameter 'contaPartialUpdate' is set
    if (contaPartialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'contaPartialUpdate' when calling atualizarParcial");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualiza parcialmente o registro de uma seguran\u00E7a mobile
   * Este recurso permite Atualizar parcialmente uma seguran\u00E7a mobile
   * @param id Identificador da conta
   * @param idSegurancaMobile Identificador da seguran\u00E7a mobile
   * @param parcialUpdate parcialUpdate
   * @return SegurancaMobileResponse
   */
  public SegurancaMobileResponse  atualizarParcialSegurancaMobile (Long id, Long idSegurancaMobile, SegurancaMobileParcialUpdate parcialUpdate) throws ApiException {
    Object postBody = parcialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialSegurancaMobile");
    }
    
    // verify the required parameter 'idSegurancaMobile' is set
    if (idSegurancaMobile == null) {
       throw new ApiException(400, "Missing the required parameter 'idSegurancaMobile' when calling atualizarParcialSegurancaMobile");
    }
    
    // verify the required parameter 'parcialUpdate' is set
    if (parcialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'parcialUpdate' when calling atualizarParcialSegurancaMobile");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/seguranca/mobile/{idSegurancaMobile}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idSegurancaMobile" + "\\}", apiInvoker.escapeString(idSegurancaMobile.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (SegurancaMobileResponse) ApiInvoker.deserialize(response, "", SegurancaMobileResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o bloqueio de uma determinada Conta
   * Este m\u00E9todo permite a realiza\u00E7\u00E3o do bloqueio de uma determinada conta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idStatus C\u00F3digo de Identifica\u00E7\u00E3o do Novo Status Conta
   * @return ContaResponse
   */
  public ContaResponse  bloquear (Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling bloquear");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquear");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/bloquear".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status", idStatus));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastro ades\u00E3o de pagamento no s\u00E1bado
   * Este recurso permite cadastrar uma ades\u00E3o de pagamento no s\u00E1bado
   * @param id Id da conta
   * @return AdesaoPagamentoSabadoResponse
   */
  public AdesaoPagamentoSabadoResponse  cadastrar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrar");
    }
    

    // create path and map variables
    String path = "/api/adesoes-pagamentos-sabados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdesaoPagamentoSabadoResponse) ApiInvoker.deserialize(response, "", AdesaoPagamentoSabadoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastro de uma seguran\u00E7a mobile
   * Este recurso permite registrar uma seguran\u00E7a mobile
   * @param id Identificador da conta
   * @param persist persist
   * @return SegurancaMobileResponse
   */
  public SegurancaMobileResponse  cadastrarSegurancaMobile (Long id, SegurancaMobilePersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarSegurancaMobile");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrarSegurancaMobile");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/seguranca/mobile".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (SegurancaMobileResponse) ApiInvoker.deserialize(response, "", SegurancaMobileResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cancelamento de uma determinada Conta
   * Este m\u00E9todo permite a realiza\u00E7\u00E3o do cancelamento de uma determinada conta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idStatus C\u00F3digo de Identifica\u00E7\u00E3o do Novo Status Conta
   * @return ContaResponse
   */
  public ContaResponse  cancelar (Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelar");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/cancelar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status", idStatus));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cancelamento de uma parcela agendada
   * Este recurso permite cancelar uma parcela agendada, sem interferir nas demais parcelas
   * @param id ID da Parcela
   * @param idAgendamento idAgendamento
   * @param idParcela idParcela
   * @return String
   */
  public String  cancelarParcela (Long id, Long idAgendamento, Long idParcela) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarParcela");
    }
    
    // verify the required parameter 'idAgendamento' is set
    if (idAgendamento == null) {
       throw new ApiException(400, "Missing the required parameter 'idAgendamento' when calling cancelarParcela");
    }
    
    // verify the required parameter 'idParcela' is set
    if (idParcela == null) {
       throw new ApiException(400, "Missing the required parameter 'idParcela' when calling cancelarParcela");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/agendamentos/{idAgendamento}/parcelas/{idParcela}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idAgendamento" + "\\}", apiInvoker.escapeString(idAgendamento.toString())).replaceAll("\\{" + "idParcela" + "\\}", apiInvoker.escapeString(idParcela.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cancelamento completo de um agendamento
   * Este recurso permite cancelar um agendamento existente, bem como todas suas parcelas em aberto
   * @param idAgendamento Id do Agendamento
   * @param id id
   * @return String
   */
  public String  carcelarAgendamento (Long idAgendamento, Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idAgendamento' is set
    if (idAgendamento == null) {
       throw new ApiException(400, "Missing the required parameter 'idAgendamento' when calling carcelarAgendamento");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling carcelarAgendamento");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/agendamentos/{idAgendamento}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idAgendamento" + "\\}", apiInvoker.escapeString(idAgendamento.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta o extrato anual de tarifas de uma conta
   * Esse recurso permite consultar o extrato anual de tarifas cobradas de uma determinada conta
   * @param id Identificador da conta
   * @param ano Ano base para gera\u00E7\u00E3o do extrato de tarifas
   * @return ExtratoTarifasResponse
   */
  public ExtratoTarifasResponse  consultaExtratoTarifasAnual (Long id, Integer ano) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultaExtratoTarifasAnual");
    }
    
    // verify the required parameter 'ano' is set
    if (ano == null) {
       throw new ApiException(400, "Missing the required parameter 'ano' when calling consultaExtratoTarifasAnual");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/extrato-tarifas/{ano}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "ano" + "\\}", apiInvoker.escapeString(ano.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExtratoTarifasResponse) ApiInvoker.deserialize(response, "", ExtratoTarifasResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta ades\u00E3o de pagamento no s\u00E1bado
   * Este recurso permite consultar uma ades\u00E3o de pagamento no s\u00E1bado
   * @param id Id da conta
   * @param dataVencimento Data de vencimento da ades\u00E3o
   * @return AdesaoPagamentoSabadoResponse
   */
  public AdesaoPagamentoSabadoResponse  consultar (Long id, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/adesoes-pagamentos-sabados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdesaoPagamentoSabadoResponse) ApiInvoker.deserialize(response, "", AdesaoPagamentoSabadoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta a data m\u00E1xima para pagamento da fatura em atraso para receber o benef\u00EDcio
   * Este m\u00E9todo permite consultar se o cliente tem direito ao benef\u00EDcio de pagamento em atraso, em loja, at\u00E9 o s\u00E1bado subsequente ao vencimento, ficando isento do pagamento de multa, encargos, mora e IOF
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return BeneficioPagamentoAtrasoResponse
   */
  public BeneficioPagamentoAtrasoResponse  consultarBeneficioPagamentoAtraso (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBeneficioPagamentoAtraso");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/consultar-beneficio-pagamento-atraso".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (BeneficioPagamentoAtrasoResponse) ApiInvoker.deserialize(response, "", BeneficioPagamentoAtrasoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta os dados de um determinado boleto da fatura
   * Este recurso consulta um boleto da fatura
   * @param id Id Conta
   * @return BoletoResponse
   */
  public BoletoResponse  consultarBoletoEmitido (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBoletoEmitido");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/consultar-dados-pagamento-fatura".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (BoletoResponse) ApiInvoker.deserialize(response, "", BoletoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta a d\u00EDvida atualizada do cliente
   * Este recurso consulta a d\u00EDvida atualizada do cliente
   * @param id Id Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataVencimento Data do vencimento
   * @param idEscritorioCobranca C\u00F3digo de identifica\u00E7\u00E3o do escrit\u00F3rio de cobran\u00E7a
   * @return DividaClienteResponse
   */
  public DividaClienteResponse  consultarDividaAtualizadaCliente (Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, Long idEscritorioCobranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDividaAtualizadaCliente");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/recuperar-divida-atualizada".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEscritorioCobranca", idEscritorioCobranca));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (DividaClienteResponse) ApiInvoker.deserialize(response, "", DividaClienteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a consulta das parcelas de um determinado agendamento
   * Este recurso lista todas as parcelas de um agendamento, independente de seus status
   * @param idAgendamento Id do Agendamento
   * @param id id
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageParcelaAgendamentoResponse
   */
  public PageParcelaAgendamentoResponse  consultarParcelasAgendamento (Long idAgendamento, Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idAgendamento' is set
    if (idAgendamento == null) {
       throw new ApiException(400, "Missing the required parameter 'idAgendamento' when calling consultarParcelasAgendamento");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarParcelasAgendamento");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/agendamentos/{idAgendamento}/parcelas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idAgendamento" + "\\}", apiInvoker.escapeString(idAgendamento.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageParcelaAgendamentoResponse) ApiInvoker.deserialize(response, "", PageParcelaAgendamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta uma transa\u00E7\u00E3o processada da conta.
   * Este recurso permite consultar os detalhes de uma transa\u00E7\u00E3o processada pertencente a uma conta.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id).
   * @param idTransacao C\u00F3digo de Identifica\u00E7\u00E3o da transa\u00E7\u00E3o (id).
   * @return TransacoesCorrentesResponse
   */
  public TransacoesCorrentesResponse  consultarProcessada (Long id, Long idTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarProcessada");
    }
    
    // verify the required parameter 'idTransacao' is set
    if (idTransacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransacao' when calling consultarProcessada");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes-processadas/{idTransacao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idTransacao" + "\\}", apiInvoker.escapeString(idTransacao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TransacoesCorrentesResponse) ApiInvoker.deserialize(response, "", TransacoesCorrentesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite consultar a partir do ID da conta as taxas e tarifas
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que os Emissores consultem as taxas e tarifas da conta
   * @param id ID da conta a ser consultada
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTaxasRefinanciamentoResponse
   */
  public PageTaxasRefinanciamentoResponse  consultarTaxasTarifas (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxasTarifas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/consultar-taxas-tarifas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageTaxasRefinanciamentoResponse) ApiInvoker.deserialize(response, "", PageTaxasRefinanciamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta dados de um determinado tipo de fun\u00E7\u00E3o para contas
   * Este m\u00E9todo permite consultar dados de um determinado tipo de fun\u00E7\u00E3o para contas a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do tipo de fun\u00E7\u00E3o para contas (id)
   * @return String
   */
  public String  consultar_1 (Integer id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_1");
    }
    

    // create path and map variables
    String path = "/api/contas/tipos-funcoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta dados de uma determinada conta
   * Este m\u00E9todo permite consultar dados de uma determinada conta a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return ContaDetalheResponse
   */
  public ContaDetalheResponse  consultar_2 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_2");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaDetalheResponse) ApiInvoker.deserialize(response, "", ContaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta extrato da conta
   * Consulta extrato da conta
   * @param id Identificador da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param idsTiposTransacoes C\u00F3digos identificadores dos tipos de transa\u00E7\u00F5es para transfer\u00EAncia de valores e que possuir\u00E3o na descri\u00E7\u00E3o do extrato, os dados da conta destino da transfer\u00EAncia.
   * @param idsTiposTransacoesTransferencias C\u00F3digos identificadores dos tipos de transa\u00E7\u00F5es que ser\u00E3o consultadas no extrato 
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataInicio Data de in\u00EDcio para consulta do extrato da conta formato yyyy-MM-dd
   * @param dataFim Data de fim para consulta do extrato da conta formato yyyy-MM-dd
   * @param idPessoaFisicaSolicitante C\u00F3digo identificador da pessoa que solicitou o extrato
   * @return PageExtratoResponse
   */
  public PageExtratoResponse  consultar_3 (Long id, List<String> sort, List<Long> idsTiposTransacoes, List<Long> idsTiposTransacoesTransferencias, Integer page, Integer limit, String dataInicio, String dataFim, Long idPessoaFisicaSolicitante) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_3");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/extratos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "idsTiposTransacoes", idsTiposTransacoes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "idsTiposTransacoesTransferencias", idsTiposTransacoesTransferencias));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoaFisicaSolicitante", idPessoaFisicaSolicitante));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageExtratoResponse) ApiInvoker.deserialize(response, "", PageExtratoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta os detalhes de uma determinada transfer\u00EAncia
   * Este m\u00E9todo permite consultar os detalhes de uma determinada transfer\u00EAncia de cr\u00E9dito realizada entre contas
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idTransferencia C\u00F3digo de Identifica\u00E7\u00E3o da transfer\u00EAncia (id_transferencia)
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse  consultar_4 (Long id, Long idTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_4");
    }
    
    // verify the required parameter 'idTransferencia' is set
    if (idTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultar_4");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes/{id_transferencia}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "id_transferencia" + "\\}", apiInvoker.escapeString(idTransferencia.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TransferenciaDetalheResponse) ApiInvoker.deserialize(response, "", TransferenciaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastrar contas MultiApp
   * Este recurso permite o cadastro de contas MultiApp
   * @param contaMultiAppPersist contaMultiAppPersist
   * @return ContaMultiAppResponse
   */
  public ContaMultiAppResponse  criarContasMultiApp (ContaMultiAppPersist contaMultiAppPersist) throws ApiException {
    Object postBody = contaMultiAppPersist;
    
    // verify the required parameter 'contaMultiAppPersist' is set
    if (contaMultiAppPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaMultiAppPersist' when calling criarContasMultiApp");
    }
    

    // create path and map variables
    String path = "/api/contas/cadastrar-conta-multiapp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaMultiAppResponse) ApiInvoker.deserialize(response, "", ContaMultiAppResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desativa o servi\u00E7o de envio de fatura por email
   * Este recurso desativa o servi\u00E7o de envio de fatura por email
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return Object
   */
  public Object  desativarEnvioFaturaEmail (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarEnvioFaturaEmail");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/desativar-fatura-email".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Gera um boleto de recarga
   * Este recurso gera um boleto de recarga
   * @param id Id Conta
   * @param valor Atributo que representa o valor do Boleto Emitido
   * @param dataVencimento Atributo que representa a data de vencimento do boleto
   * @return BoletoResponse
   */
  public BoletoResponse  gerarBoletoRecarga (Long id, BigDecimal valor, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoletoRecarga");
    }
    
    // verify the required parameter 'valor' is set
    if (valor == null) {
       throw new ApiException(400, "Missing the required parameter 'valor' when calling gerarBoletoRecarga");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling gerarBoletoRecarga");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-boleto-recarga".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valor", valor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (BoletoResponse) ApiInvoker.deserialize(response, "", BoletoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a gera\u00E7\u00E3o de um novo cart\u00E3o para impress\u00E3o avulsa
   * Este recurso permite que seja gerado um novo Cart\u00E3o para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cart\u00E3o que dever\u00E1 ser gerado para impress\u00E3o. Esta funcionalidade poder\u00E1 ser utilizada para realizar a impress\u00E3o de cart\u00F5es em Lojas, Quiosques, Escrit\u00F3rios, Terminais de Auto Atendimento, ou outro local que o Emissor escolher, desde que se possua uma impressora de Cart\u00F5es habilidade para o fazer, no local
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param idPessoa C\u00F3digo de identifica\u00E7\u00E3o da pessoa (id)
   * @param idTipoPlastico C\u00F3digo de identifica\u00E7\u00E3o do TipoPlastico (id)
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse  gerarCartao (Long id, Long idPessoa, Long idTipoPlastico) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartao");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartao");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "id_pessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_tipo_plastico", idTipoPlastico));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (CartaoImpressaoResponse) ApiInvoker.deserialize(response, "", CartaoImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o envio para gera\u00E7\u00E3o de um novo cart\u00E3o na gr\u00E1fica
   * Este recurso permite que seja gerado um novo Cart\u00E3o para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cart\u00E3o que dever\u00E1 ser gerado para impress\u00E3o. Esta funcionalidade poder\u00E1 ser utilizada para impress\u00E3o de cart\u00F5es em gr\u00E1fica
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param cartaoEmbossingRequest cartaoEmbossingRequest
   * @return CartaoEmbossingResponse
   */
  public CartaoEmbossingResponse  gerarCartaoEmbossing (Long id, CartaoEmbossingRequest cartaoEmbossingRequest) throws ApiException {
    Object postBody = cartaoEmbossingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoEmbossing");
    }
    
    // verify the required parameter 'cartaoEmbossingRequest' is set
    if (cartaoEmbossingRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'cartaoEmbossingRequest' when calling gerarCartaoEmbossing");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-grafica".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (CartaoEmbossingResponse) ApiInvoker.deserialize(response, "", CartaoEmbossingResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a gera\u00E7\u00E3o de um cart\u00E3o provisorio
   * Este recurso permite que seja gerado um cart\u00E3o provis\u00F3rio para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return CartaoImpressaoProvisorioResponse
   */
  public CartaoImpressaoProvisorioResponse  gerarCartaoProvisorio (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoProvisorio");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-provisorio".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (CartaoImpressaoProvisorioResponse) ApiInvoker.deserialize(response, "", CartaoImpressaoProvisorioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a gera\u00E7\u00E3o de um cart\u00E3o virtual
   * Este recurso permite que seja gerado um Cart\u00E3o virtual para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id). Esta funcionalidade poder\u00E1 ser utilizada para realizar a cria\u00E7\u00E3o de cart\u00F5es virtuaes atraves de um app
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param dataValidade Data de Validade
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse  gerarCartaoVirtual (Long id, String dataValidade) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoVirtual");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling gerarCartaoVirtual");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-virtual".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataValidade", dataValidade));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (CartaoImpressaoResponse) ApiInvoker.deserialize(response, "", CartaoImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista contas existentes na base de dados do Emissor
   * Este recurso permite listar contas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idProduto C\u00F3digo de identifica\u00E7\u00E3o do produto ao qual a conta faz parte. (id)
   * @param idOrigemComercial C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id) que deu origem a Conta
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Titular da Conta (id)
   * @param idStatusConta C\u00F3digo de Identifica\u00E7\u00E3o do status da conta
   * @param diaVencimento Apresenta o dia de vencimento
   * @param melhorDiaCompra Apresenta o melhor dia de compra
   * @param dataStatusConta Apresenta a data em que o idStatusConta atual fora atribu\u00EDdo para ela
   * @param dataCadastro Apresenta a data em que o cart\u00E3o foi gerado
   * @param dataUltimaAlteracaoVencimento Apresenta a data da ultima altera\u00E7\u00E3o de vencimento
   * @param funcaoAtiva 
   * @return PageContaResponse
   */
  public PageContaResponse  listar (List<String> sort, Integer page, Integer limit, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, String dataStatusConta, String dataCadastro, String dataUltimaAlteracaoVencimento, String funcaoAtiva) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusConta", idStatusConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "diaVencimento", diaVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "melhorDiaCompra", melhorDiaCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataStatusConta", dataStatusConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataUltimaAlteracaoVencimento", dataUltimaAlteracaoVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "funcaoAtiva", funcaoAtiva));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageContaResponse) ApiInvoker.deserialize(response, "", PageContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista o hist\u00F3rico de altera\u00E7\u00F5es de limites da conta
   * Este recurso consulta o hist\u00F3rico com as altera\u00E7\u00F5es de limites da conta informada
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageHistoricoEventosResponse
   */
  public PageHistoricoEventosResponse  listarHistoricoAlteracoesLimites (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimites");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/historicos-alteracoes-limites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageHistoricoEventosResponse) ApiInvoker.deserialize(response, "", PageHistoricoEventosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista o hist\u00F3rico de entradas/sa\u00EDdas de assessorias de cobran\u00E7a
   * Permite listar todos os registros de entrada e sa\u00EDda da Conta em arquivos de integra\u00E7\u00E3o com empresas de assessorias de cobran\u00E7a a partir do c\u00F3digo de identifica\u00E7\u00E3o da conta (idConta)
   * @param id Id Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageHistoricoAssessoriaResponse
   */
  public PageHistoricoAssessoriaResponse  listarHistoricoAssessoria (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAssessoria");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/historicos-assessorias-cobranca".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageHistoricoAssessoriaResponse) ApiInvoker.deserialize(response, "", PageHistoricoAssessoriaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista o historico de atrasos das faturas
   * Este recurso lista o hist\u00F3rico do pagamento de faturas em atraso
   * @param id Id Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageHistoricoAtrasoFaturaResponse
   */
  public PageHistoricoAtrasoFaturaResponse  listarHistoricoAtrasosFaturas (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAtrasosFaturas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/historicos-faturas-atrasos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageHistoricoAtrasoFaturaResponse) ApiInvoker.deserialize(response, "", PageHistoricoAtrasoFaturaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as transa\u00E7\u00F5es n\u00E3o processadas da conta
   * Este m\u00E9todo permite que sejam listadas todas as transa\u00E7\u00F5es n\u00E3o processadas da Conta.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataInicio Data de in\u00EDcio da consulta do extrato no formato yyyy-MM-dd (Par\u00E2mentro Ignorado se dataFim n\u00E3o for definida)
   * @param dataFim Data fim da consulta do extrato no formato yyyy-MM-dd  (Par\u00E2mentro Ignorado se dataInicio n\u00E3o for definida)
   * @return PageTransacaoNaoProcessadaResponse
   */
  public PageTransacaoNaoProcessadaResponse  listarNaoProcessadas (Long id, List<String> sort, Integer page, Integer limit, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarNaoProcessadas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes/listar-nao-processadas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageTransacaoNaoProcessadaResponse) ApiInvoker.deserialize(response, "", PageTransacaoNaoProcessadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as transa\u00E7\u00F5es processadas da conta
   * Este m\u00E9todo permite que sejam listadas todas as transa\u00E7\u00F5es processadas da Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id).
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataVencimento Data de vencimento do extrato no formato yyyy-MM-dd
   * @param dataInicio Data de in\u00EDcio da consulta do extrato no formato yyyy-MM-dd (Ignorado quando o par\u00E2mentro dataVencimento \u00E9 usado)
   * @param dataFim Data fim da consulta do extrato no formato yyyy-MM-dd  (Ignorado quando o par\u00E2mentro dataVencimento \u00E9 usado)
   * @param idTipoTransacao transacoes_processadas_request_tipo_transacao
   * @param recuperaEncargos Adiciona as transa\u00E7\u00F5es de encargos na consulta
   * @return PageTransacoesCorrentesResponse
   */
  public PageTransacoesCorrentesResponse  listarProcessadas (Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Integer recuperaEncargos) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarProcessadas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes/listar-processadas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTransacao", idTipoTransacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "recuperaEncargos", recuperaEncargos));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageTransacoesCorrentesResponse) ApiInvoker.deserialize(response, "", PageTransacoesCorrentesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista registros da seguran\u00E7a mobile
   * Este recurso permite listar registros da seguran\u00E7a mobile
   * @param id Identificador da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param validos Obt\u00EAm registros n\u00E3o expirados caso for verdadeiro
   * @param statusRequisicao Status da requisi\u00E7\u00E3o/solicita\u00E7\u00E3o do token
   * @param cpfCnpj CNPJ ou CPF da pessoa
   * @param dataExpiracao Data de expira\u00E7\u00E3o do token
   * @param token Valor do token
   * @param tablet Identificador do Tablet
   * @param deviceName Nome do dispositivo
   * @param deviceToken Token do dispositivo
   * @param canal Canal de entrada
   * @param dataUtilizacao Data da utiliza\u00E7\u00E3o do token
   * @param dataAtivacao Data da ativa\u00E7\u00E3o do token
   * @param chapaPromotor Chapa do promotor 
   * @param codOperacaoNeurotech C\u00F3digo de opera\u00E7\u00E3o da Neurotech
   * @param respostaNeurotech Resposta da Neurotech
   * @return PageSegurancaMobileResponse
   */
  public PageSegurancaMobileResponse  listarSegurancaMobile (Long id, List<String> sort, Integer page, Integer limit, Boolean validos, String statusRequisicao, String cpfCnpj, String dataExpiracao, String token, String tablet, String deviceName, String deviceToken, String canal, String dataUtilizacao, String dataAtivacao, String chapaPromotor, String codOperacaoNeurotech, String respostaNeurotech) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarSegurancaMobile");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/seguranca/mobile".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "validos", validos));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "statusRequisicao", statusRequisicao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpfCnpj", cpfCnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataExpiracao", dataExpiracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "token", token));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tablet", tablet));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deviceName", deviceName));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deviceToken", deviceToken));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "canal", canal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataUtilizacao", dataUtilizacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAtivacao", dataAtivacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "chapaPromotor", chapaPromotor));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codOperacaoNeurotech", codOperacaoNeurotech));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "respostaNeurotech", respostaNeurotech));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageSegurancaMobileResponse) ApiInvoker.deserialize(response, "", PageSegurancaMobileResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Este recurso permite que uma proje\u00E7\u00E3o de compra ainda n\u00E3o processada seja recuperada. Os valores das compras s\u00E3o agrupados e exibidos em blocos mensais.
   * Este recurso permite que uma proje\u00E7\u00E3o de compra ainda n\u00E3o processada seja recuperada. Os valores das compras s\u00E3o agrupados e exibidos em blocos mensais.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageProjecaoCompraNaoProcessadaResponse
   */
  public PageProjecaoCompraNaoProcessadaResponse  listarTransacoesProjetadas (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarTransacoesProjetadas");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes/projetadas".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageProjecaoCompraNaoProcessadaResponse) ApiInvoker.deserialize(response, "", PageProjecaoCompraNaoProcessadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os tipos de fun\u00E7\u00F5es para contas do Emissor
   * Este recurso permite listar os tipos de fun\u00E7\u00F5es para as contas do Emissor
   * @return String
   */
  public String  listar_5 () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas/tipos-funcoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a listagem de todos os agendamentos
   * Este recurso permite listar todos os agendamentos
   * @param id id
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param tipoOperacao Tipo opera\u00E7\u00E3o 
   * @param tipoRecorrencia Tipo Recorr\u00EAncia
   * @param quantidadeAgendamento Quantidade agendamento 
   * @param diaRecorrencia Dia recorr\u00EAncia
   * @param valor Valor Agendamento
   * @return String
   */
  public String  listar_6 (Long id, List<String> sort, Integer page, Integer limit, Integer tipoOperacao, Integer tipoRecorrencia, Integer quantidadeAgendamento, Integer diaRecorrencia, BigDecimal valor) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listar_6");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/agendamentos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoOperacao", tipoOperacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoRecorrencia", tipoRecorrencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeAgendamento", quantidadeAgendamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "diaRecorrencia", diaRecorrencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valor", valor));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as transa\u00E7\u00F5es n\u00E3o processadas e processadas da conta
   * Este m\u00E9todo permite que sejam listadas todas as transa\u00E7\u00F5es n\u00E3o processadas e processadas da Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param status Status da transa\u00E7\u00E3o
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataVencimento Data de vencimento do extrato no formato yyyy-MM-dd
   * @param dataInicio Data de in\u00EDcio da consulta do extrato no formato yyyy-MM-dd (Ignorado quando o par\u00E2mentro dataVencimento \u00E9 usado)
   * @param dataFim Data fim da consulta do extrato no formato yyyy-MM-dd  (Ignorado quando o par\u00E2mentro dataVencimento \u00E9 usado)
   * @param idTipoTransacao transacoes_processadas_nao_processadas_request_tipo_transacao
   * @param flagCredito Flag que indica se a transa\u00E7\u00E3o \u00E9 cr\u00E9dito
   * @param flagFaturado Flag que indica se a transa\u00E7\u00E3o foi faturada
   * @param flagProcessada Flag que indica se a transa\u00E7\u00E3o foi processada
   * @param plano Plano da transa\u00E7\u00E3o
   * @param codigoMCC C\u00F3digo MCC da transa\u00E7\u00E3o
   * @param grupoMCC Grupo MCC da transa\u00E7\u00E3o
   * @return PageTransacaoProcessadaNaoProcessadaResponse
   */
  public PageTransacaoProcessadaNaoProcessadaResponse  listar_7 (Long id, List<String> sort, List<Integer> status, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Boolean flagCredito, Boolean flagFaturado, Boolean flagProcessada, Integer plano, Long codigoMCC, Long grupoMCC) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listar_7");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transacoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTransacao", idTipoTransacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagCredito", flagCredito));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagFaturado", flagFaturado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagProcessada", flagProcessada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plano", plano));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoMCC", codigoMCC));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grupoMCC", grupoMCC));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageTransacaoProcessadaNaoProcessadaResponse) ApiInvoker.deserialize(response, "", PageTransacaoProcessadaNaoProcessadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as transfer\u00EAncias realizadas pela conta
   * Este m\u00E9todo permite que sejam listadas as transfer\u00EAncias realizadas pela conta existentes na base do emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTransferencia C\u00F3digo de identifica\u00E7\u00E3o da transfer\u00EAncia (id)
   * @param idContaOrigem C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 debitado para a transfer\u00EAncia. (id)
   * @param idContaDestino C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 creditado para a transfer\u00EAncia. (id)
   * @param valorTransferencia Valor estabelecido para ser transferido
   * @param dataTransferencia Data estabelecida para ocorrer a transfer\u00EAncia
   * @return PageTransferenciaResponse
   */
  public PageTransferenciaResponse  listar_8 (Long id, List<String> sort, Integer page, Integer limit, Long idTransferencia, Long idContaOrigem, Long idContaDestino, BigDecimal valorTransferencia, String dataTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listar_8");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTransferencia", idTransferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idContaOrigem", idContaOrigem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idContaDestino", idContaDestino));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorTransferencia", valorTransferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataTransferencia", dataTransferencia));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageTransferenciaResponse) ApiInvoker.deserialize(response, "", PageTransferenciaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a normaliza\u00E7\u00E3o de uma conta
   * Este m\u00E9todo permite que uma conta seja normalizada, ajustando assim o seu status e lan\u00E7ando os ajustes necess\u00E1rios
   * @param id C\u00F3digo de identifica\u00E7\u00E3o de uma Conta (id)
   * @param login login
   * @return Object
   */
  public Object  normalizacao (Long id, String login) throws ApiException {
    Object postBody = login;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling normalizacao");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/normalizacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a reativa\u00E7\u00E3o de contas
   * Este recurso permite reativar contas. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id)
   * @param id Id Conta
   * @return Object
   */
  public Object  reativar (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling reativar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/reativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de uma nova conta
   * Esse recurso permite cadastrar uma nova conta para uma pessoa j\u00E1 existente na base de dados do emissor
   * @param contaPersist contaPersist
   * @return ContaResponse
   */
  public ContaResponse  salvar (ContaPersist contaPersist) throws ApiException {
    Object postBody = contaPersist;
    
    // verify the required parameter 'contaPersist' is set
    if (contaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'contaPersist' when calling salvar");
    }
    

    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContaResponse) ApiInvoker.deserialize(response, "", ContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza um cadastro de uma nova ades\u00E3o do servi\u00E7o
   * Este recurso permite cadastrar uma nova ades\u00E3o de servi\u00E7o na base do emissor
   * @param id Identificador da conta
   * @param adesaoServicoPersist adesaoServicoPersist
   * @return AdesaoServicoResponse
   */
  public AdesaoServicoResponse  salvarAdesaoServicos (Long id, AdesaoServicoPersist adesaoServicoPersist) throws ApiException {
    Object postBody = adesaoServicoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarAdesaoServicos");
    }
    
    // verify the required parameter 'adesaoServicoPersist' is set
    if (adesaoServicoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'adesaoServicoPersist' when calling salvarAdesaoServicos");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adesoes-servicos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdesaoServicoResponse) ApiInvoker.deserialize(response, "", AdesaoServicoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o agendamento de transacoes
   * Este recurso permite agendar opera\u00E7\u00F5es financeiras
   * @param agendamentoPersist agendamentoPersist
   * @param id id
   * @return AgendamentoResponse
   */
  public AgendamentoResponse  salvarAgendamento (AgendamentoPersist agendamentoPersist, Long id) throws ApiException {
    Object postBody = agendamentoPersist;
    
    // verify the required parameter 'agendamentoPersist' is set
    if (agendamentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'agendamentoPersist' when calling salvarAgendamento");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarAgendamento");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/agendamentos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AgendamentoResponse) ApiInvoker.deserialize(response, "", AgendamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Simula valores de presta\u00E7\u00F5es de empr\u00E9stimos/financiamentos
   * Esta opera\u00E7\u00E3o pode ser utilizada para simular opera\u00E7\u00F5es financeiras a partir de informa\u00E7\u00F5es fornecidas pelo usu\u00E1rio. Os c\u00E1lculos gerados devem ser considerados apenas como refer\u00EAncia para as situa\u00E7\u00F5es reais e n\u00E3o como valores oficiais
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param request request
   * @return EmprestimoPessoalResponse
   */
  public EmprestimoPessoalResponse  simularEmprestimoFinanciamento (Long id, EmprestimoPessoalRequest request) throws ApiException {
    Object postBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling simularEmprestimoFinanciamento");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
       throw new ApiException(400, "Missing the required parameter 'request' when calling simularEmprestimoFinanciamento");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/simular-emprestimos-financiamentos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (EmprestimoPessoalResponse) ApiInvoker.deserialize(response, "", EmprestimoPessoalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite listar uma linha do tempo com os eventos da conta
   * Esta opera\u00E7\u00E3o tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. Transa\u00E7\u00F5es, fechamento da fatura, pagamentos, gera\u00E7\u00E3o de cart\u00F5es e altera\u00E7\u00E3o de limite s\u00E3o exemplos de eventos contemplados por esta funcionalidade. Neste m\u00E9todo, as opera\u00E7\u00F5es s\u00E3o ordenadas de forma decrescente
   * @param id Id Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTransacaoResponse
   */
  public PageTransacaoResponse  transacoes (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling transacoes");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/timeline".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageTransacaoResponse) ApiInvoker.deserialize(response, "", PageTransacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza uma transfer\u00EAncia de Cr\u00E9dito para outro cliente do mesmo Emissor
   * Este m\u00E9todo permite que um portador de um cart\u00E3o possa realizar auma transfer\u00EAncia de cr\u00E9dito para outro cliente do mesmo emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta do cliente portador do cart\u00E3o que ser\u00E1 debitado (id)
   * @param idContaDestino C\u00F3digo de Identifica\u00E7\u00E3o do cliente portador do cart\u00E3o que ser\u00E1 creditado (id)
   * @param valorTransferencia Valor da Transfer\u00EAncia
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse  transferir (Long id, Long idContaDestino, BigDecimal valorTransferencia) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling transferir");
    }
    
    // verify the required parameter 'idContaDestino' is set
    if (idContaDestino == null) {
       throw new ApiException(400, "Missing the required parameter 'idContaDestino' when calling transferir");
    }
    
    // verify the required parameter 'valorTransferencia' is set
    if (valorTransferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'valorTransferencia' when calling transferir");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_conta_destino", idContaDestino));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valor_transferencia", valorTransferencia));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TransferenciaDetalheResponse) ApiInvoker.deserialize(response, "", TransferenciaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Transferir cr\u00E9dito entre portadores
   * Este recurso permite realizar uma transfer\u00EAncia de cr\u00E9ditos, atrav\u00E9s de ajustes, entre portadores da mesma conta
   * @param id Id da conta
   * @param transferencia transferencia
   * @return TransferenciaPortadoresResponse
   */
  public TransferenciaPortadoresResponse  transferirCreditoPortadores (Long id, TransferenciaPortadoresPersist transferencia) throws ApiException {
    Object postBody = transferencia;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling transferirCreditoPortadores");
    }
    
    // verify the required parameter 'transferencia' is set
    if (transferencia == null) {
       throw new ApiException(400, "Missing the required parameter 'transferencia' when calling transferirCreditoPortadores");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-portadores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TransferenciaPortadoresResponse) ApiInvoker.deserialize(response, "", TransferenciaPortadoresResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
