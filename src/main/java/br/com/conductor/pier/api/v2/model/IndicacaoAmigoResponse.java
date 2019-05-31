package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa o objeto de resposta de uma indica\u00E7\u00E3o
 **/
@ApiModel(description = "Representa o objeto de resposta de uma indica\u00E7\u00E3o")
public class IndicacaoAmigoResponse  {
  
  @SerializedName("codigoIndicacao")
  private Long codigoIndicacao = null;
  @SerializedName("cpfIndicado")
  private String cpfIndicado = null;
  @SerializedName("dataIndicacao")
  private String dataIndicacao = null;
  @SerializedName("dataUtilizacao")
  private String dataUtilizacao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("emailIndicado")
  private String emailIndicado = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * C\u00F3digo da indica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo da indica\u00E7\u00E3o")
  public Long getCodigoIndicacao() {
    return codigoIndicacao;
  }
  public void setCodigoIndicacao(Long codigoIndicacao) {
    this.codigoIndicacao = codigoIndicacao;
  }

  
  /**
   * N\u00FAmero do CPF do amigo indicado
   **/
  @ApiModelProperty(value = "N\u00FAmero do CPF do amigo indicado")
  public String getCpfIndicado() {
    return cpfIndicado;
  }
  public void setCpfIndicado(String cpfIndicado) {
    this.cpfIndicado = cpfIndicado;
  }

  
  /**
   * Data da indica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data da indica\u00E7\u00E3o")
  public String getDataIndicacao() {
    return dataIndicacao;
  }
  public void setDataIndicacao(String dataIndicacao) {
    this.dataIndicacao = dataIndicacao;
  }

  
  /**
   * Data da utiliza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data da utiliza\u00E7\u00E3o")
  public String getDataUtilizacao() {
    return dataUtilizacao;
  }
  public void setDataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
  }

  
  /**
   * Data de validade da indica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data de validade da indica\u00E7\u00E3o")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Email do amigo indicado
   **/
  @ApiModelProperty(value = "Email do amigo indicado")
  public String getEmailIndicado() {
    return emailIndicado;
  }
  public void setEmailIndicado(String emailIndicado) {
    this.emailIndicado = emailIndicado;
  }

  
  /**
   * C\u00F3digo identificador da indica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da indica\u00E7\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da pessoa
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)
   **/
  @ApiModelProperty(value = "Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicacaoAmigoResponse {\n");
    
    sb.append("  codigoIndicacao: ").append(codigoIndicacao).append("\n");
    sb.append("  cpfIndicado: ").append(cpfIndicado).append("\n");
    sb.append("  dataIndicacao: ").append(dataIndicacao).append("\n");
    sb.append("  dataUtilizacao: ").append(dataUtilizacao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  emailIndicado: ").append(emailIndicado).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
