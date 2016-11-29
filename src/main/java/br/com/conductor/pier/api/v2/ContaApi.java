package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.Conta;
import br.com.conductor.pier.api.v2.model.CartaoImpressao;
import java.util.Date;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class ContaApi {
  String basePath = "https://localhost/";
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
   * Alterar limite
   * Esse recurso permite realizar a altera\u00C3\u00A7\u00C3\u00A3o dos Limites de uma determinada Conta.
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param limiteGlobal Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.
   * @param limiteCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais.
   * @param limiteParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.
   * @param limiteParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.
   * @param limiteSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   * @param limiteSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.
   * @param limiteConsignado Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.
   * @param limiteInternacionalCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.
   * @param limiteInternacionalParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.
   * @param limiteInternacionalParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   * @param limiteInternacionalSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional.
   * @param limiteInternacionalSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional dentro de cada ciclo de faturamento.
   * @return Conta
   */
  public Conta  alterarLimiteUsingPUT (Long idConta, Double limiteGlobal, Double limiteCompra, Double limiteParcelado, Double limiteParcelas, Double limiteSaqueGlobal, Double limiteSaquePeriodo, Double limiteConsignado, Double limiteInternacionalCompra, Double limiteInternacionalParcelado, Double limiteInternacionalParcelas, Double limiteInternacionalSaqueGlobal, Double limiteInternacionalSaquePeriodo) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteGlobal' is set
    if (limiteGlobal == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteGlobal' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteCompra' is set
    if (limiteCompra == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteCompra' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteParcelado' is set
    if (limiteParcelado == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteParcelado' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteParcelas' is set
    if (limiteParcelas == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteParcelas' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteSaqueGlobal' is set
    if (limiteSaqueGlobal == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteSaqueGlobal' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteSaquePeriodo' is set
    if (limiteSaquePeriodo == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteSaquePeriodo' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteConsignado' is set
    if (limiteConsignado == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteConsignado' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalCompra' is set
    if (limiteInternacionalCompra == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalCompra' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalParcelado' is set
    if (limiteInternacionalParcelado == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalParcelado' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalParcelas' is set
    if (limiteInternacionalParcelas == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalParcelas' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalSaqueGlobal' is set
    if (limiteInternacionalSaqueGlobal == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalSaqueGlobal' when calling alterarLimiteUsingPUT");
    }
    
    // verify the required parameter 'limiteInternacionalSaquePeriodo' is set
    if (limiteInternacionalSaquePeriodo == null) {
       throw new ApiException(400, "Missing the required parameter 'limiteInternacionalSaquePeriodo' when calling alterarLimiteUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/contas/{id_conta}/alterar-limites".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_conta" + "\\}", apiInvoker.escapeString(idConta.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteGlobal", limiteGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteCompra", limiteCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteParcelado", limiteParcelado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteParcelas", limiteParcelas));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteSaqueGlobal", limiteSaqueGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteSaquePeriodo", limiteSaquePeriodo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteConsignado", limiteConsignado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalCompra", limiteInternacionalCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalParcelado", limiteInternacionalParcelado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalParcelas", limiteInternacionalParcelas));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalSaqueGlobal", limiteInternacionalSaqueGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalSaquePeriodo", limiteInternacionalSaquePeriodo));
    

    

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
        return (Conta) ApiInvoker.deserialize(response, "", Conta.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Alterar vencimento
   * Esse recurso permite alterar o vencimento de uma conta especifica.
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param novoDiaVencimento Novo dia de vencimento.
   * @return Conta
   */
  public Conta  alterarVencimentoUsingPUT (Long idConta, Integer novoDiaVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling alterarVencimentoUsingPUT");
    }
    
    // verify the required parameter 'novoDiaVencimento' is set
    if (novoDiaVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'novoDiaVencimento' when calling alterarVencimentoUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/contas/{id_conta}/alterar-vencimento".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_conta" + "\\}", apiInvoker.escapeString(idConta.toString()));

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
        return (Conta) ApiInvoker.deserialize(response, "", Conta.class);
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
   * Este m\u00C3\u00A9todo permite consultar dados de uma determinada conta a partir de seu codigo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @return Conta
   */
  public Conta  consultarUsingGET1 (Long idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/contas/{id_conta}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_conta" + "\\}", apiInvoker.escapeString(idConta.toString()));

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
        return (Conta) ApiInvoker.deserialize(response, "", Conta.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a gera\u00C3\u00A7\u00C3\u00A3o de um novo cart\u00C3\u00A3o para impress\u00C3\u00A3o avulsa
   * 
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param idPessoa C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da pessoa (id).
   * @return CartaoImpressao
   */
  public CartaoImpressao  gerarCartaoUsingPOST (Long idConta, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling gerarCartaoUsingPOST");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartaoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id_conta}/pessoas/{id_pessoa}/gerar-cartao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_conta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "id_pessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

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
        return (CartaoImpressao) ApiInvoker.deserialize(response, "", CartaoImpressao.class);
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
   * Este recurso permite listar contas existentes na base de dados do Emissor.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de conta (id).
   * @param idProduto C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do produto ao qual a conta faz parte. (id).
   * @param idOrigemComercial C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id) que deu origem a Conta.
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa Titular da Conta (id).
   * @param idStatusConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   * @param diaVencimento Apresenta o dia de vencimento.
   * @param melhorDiaCompra Apresenta o melhor dia de compra.
   * @param dataStatusConta Apresenta a data em que o idStatusConta atual fora atribu\u00C3\u00ADdo para ela.
   * @param dataCadastro Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   * @param dataUltimaAlteracaoVencimento Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return Conta
   */
  public Conta  listarUsingGET1 (Long id, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, Date dataStatusConta, Date dataCadastro, Date dataUltimaAlteracaoVencimento, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusConta", idStatusConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "diaVencimento", diaVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "melhorDiaCompra", melhorDiaCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataStatusConta", dataStatusConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataUltimaAlteracaoVencimento", dataUltimaAlteracaoVencimento));
    
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
        return (Conta) ApiInvoker.deserialize(response, "", Conta.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

