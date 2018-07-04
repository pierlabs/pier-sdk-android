package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{cartao_response_description}}}
 **/
@ApiModel(description = "{{{cartao_response_description}}}")
public class CartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("flagTitular")
  private Integer flagTitular = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("sequencialCartao")
  private Integer sequencialCartao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idStatus")
  private Long idStatus = null;
  @SerializedName("dataStatus")
  private String dataStatus = null;
  @SerializedName("idEstagio")
  private Long idEstagio = null;
  @SerializedName("dataEstagio")
  private String dataEstagio = null;
  @SerializedName("numeroBin")
  private Long numeroBin = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("numeroCartaoHash")
  private Long numeroCartaoHash = null;
  @SerializedName("numeroCartaoCriptografado")
  private String numeroCartaoCriptografado = null;
  @SerializedName("dataEmissao")
  private String dataEmissao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("cartaoVirtual")
  private Integer cartaoVirtual = null;
  @SerializedName("impressaoAvulsa")
  private Integer impressaoAvulsa = null;
  @SerializedName("dataImpressao")
  private String dataImpressao = null;
  @SerializedName("nomeArquivoImpressao")
  private String nomeArquivoImpressao = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;

  
  /**
   * {{{cartao_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{cartao_response_flag_titular_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_flag_titular_value}}}")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * {{{cartao_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_response_sequencial_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_sequencial_cartao_value}}}")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * {{{cartao_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_response_id_status_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_id_status_value}}}")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * {{{cartao_response_data_status_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_data_status_value}}}")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * {{{cartao_response_id_estagio_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_id_estagio_value}}}")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * {{{cartao_response_data_estagio_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_data_estagio_value}}}")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * {{{cartao_response_numero_bin_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_numero_bin_value}}}")
  public Long getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * {{{cartao_response_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_response_numero_cartao_hash_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_numero_cartao_hash_value}}}")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  
  /**
   * {{{cartao_response_numero_cartao_criptografado_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_numero_cartao_criptografado_value}}}")
  public String getNumeroCartaoCriptografado() {
    return numeroCartaoCriptografado;
  }
  public void setNumeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
  }

  
  /**
   * {{{cartao_response_data_emissao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_data_emissao_value}}}")
  public String getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   * {{{cartao_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{cartao_response_cartao_virtual_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_cartao_virtual_value}}}")
  public Integer getCartaoVirtual() {
    return cartaoVirtual;
  }
  public void setCartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
  }

  
  /**
   * {{{cartao_response_impressao_avulsa_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_impressao_avulsa_value}}}")
  public Integer getImpressaoAvulsa() {
    return impressaoAvulsa;
  }
  public void setImpressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
  }

  
  /**
   * {{{cartao_response_data_impressao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_data_impressao_value}}}")
  public String getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * {{{cartao_response_nome_arquivo_impressao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_nome_arquivo_impressao_value}}}")
  public String getNomeArquivoImpressao() {
    return nomeArquivoImpressao;
  }
  public void setNomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
  }

  
  /**
   * {{{cartao_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{cartao_response_nome_impresso_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_nome_impresso_value}}}")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{cartao_response_codigo_desbloqueio_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_response_codigo_desbloqueio_value}}}")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  flagTitular: ").append(flagTitular).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  sequencialCartao: ").append(sequencialCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idStatus: ").append(idStatus).append("\n");
    sb.append("  dataStatus: ").append(dataStatus).append("\n");
    sb.append("  idEstagio: ").append(idEstagio).append("\n");
    sb.append("  dataEstagio: ").append(dataEstagio).append("\n");
    sb.append("  numeroBin: ").append(numeroBin).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  numeroCartaoHash: ").append(numeroCartaoHash).append("\n");
    sb.append("  numeroCartaoCriptografado: ").append(numeroCartaoCriptografado).append("\n");
    sb.append("  dataEmissao: ").append(dataEmissao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  cartaoVirtual: ").append(cartaoVirtual).append("\n");
    sb.append("  impressaoAvulsa: ").append(impressaoAvulsa).append("\n");
    sb.append("  dataImpressao: ").append(dataImpressao).append("\n");
    sb.append("  nomeArquivoImpressao: ").append(nomeArquivoImpressao).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


