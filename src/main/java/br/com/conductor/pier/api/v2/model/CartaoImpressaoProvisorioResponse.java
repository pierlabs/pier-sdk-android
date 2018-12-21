package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{cartao_impressao_provisorio_response_description}}}
 **/
@ApiModel(description = "{{{cartao_impressao_provisorio_response_description}}}")
public class CartaoImpressaoProvisorioResponse  {
  
  @SerializedName("flagVirtual")
  private Integer flagVirtual = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{cartao_impressao_provisorio_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_provisorio_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_impressao_provisorio_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_provisorio_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_impressao_provisorio_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_provisorio_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{cartao_impressao_provisorio_response_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_provisorio_response_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_impressao_provisorio_response_nome_plastico_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_provisorio_response_nome_plastico_value}}}")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{cartao_impressao_provisorio_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_provisorio_response_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressaoProvisorioResponse {\n");
    
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
