package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{cartao_embossing_response_description}}}
 **/
@ApiModel(description = "{{{cartao_embossing_response_description}}}")
public class CartaoEmbossingResponse  {
  
  @SerializedName("flagVirtual")
  private Integer flagVirtual = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idBandeira")
  private Long idBandeira = null;
  @SerializedName("idTipoCartao")
  private Long idTipoCartao = null;
  @SerializedName("dataGeracao")
  private String dataGeracao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("nomeOrigemComercial")
  private String nomeOrigemComercial = null;
  @SerializedName("cpf")
  private String cpf = null;

  
  /**
   * {{{cartao_embossing_response_flag_virtual_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_flag_virtual_value}}}")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{cartao_embossing_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_embossing_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_embossing_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{cartao_embossing_response_id_bandeira_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_id_bandeira_value}}}")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * {{{cartao_embossing_response_id_tipo_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_id_tipo_cartao_value}}}")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{cartao_embossing_response_data_geracao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_data_geracao_value}}}")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * {{{cartao_embossing_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{cartao_embossing_response_nome_origem_comercial_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_nome_origem_comercial_value}}}")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * {{{cartao_embossing_response_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_embossing_response_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmbossingResponse {\n");
    
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idBandeira: ").append(idBandeira).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  dataGeracao: ").append(dataGeracao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  nomeOrigemComercial: ").append(nomeOrigemComercial).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


