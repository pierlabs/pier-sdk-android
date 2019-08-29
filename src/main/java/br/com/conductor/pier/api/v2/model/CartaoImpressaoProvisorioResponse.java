package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto cart\u00E3o provis\u00F3rio
 **/
@ApiModel(description = "Objeto cart\u00E3o provis\u00F3rio")
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
  @SerializedName("idMifare")
  private Long idMifare = null;
  @SerializedName("matriculaMifare")
  private String matriculaMifare = null;

  
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
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id) a qual o cart\u00E3o gerado pertence
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id) a qual o cart\u00E3o gerado pertence")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) portadora do cart\u00E3o gerado
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) portadora do cart\u00E3o gerado")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id) que foi gerado
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id) que foi gerado")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Apresenta o n\u00FAmero do cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero do cart\u00E3o")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Apresenta o nome do Portador do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o nome do Portador do Cart\u00E3o")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * Apresenta a data de Validade do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta a data de Validade do Cart\u00E3o")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * C\u00F3digo identificador da tecnologia MIFARE
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da tecnologia MIFARE")
  public Long getIdMifare() {
    return idMifare;
  }
  public void setIdMifare(Long idMifare) {
    this.idMifare = idMifare;
  }

  
  /**
   * N\u00FAmero da matricula do portador
   **/
  @ApiModelProperty(value = "N\u00FAmero da matricula do portador")
  public String getMatriculaMifare() {
    return matriculaMifare;
  }
  public void setMatriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
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
    sb.append("  idMifare: ").append(idMifare).append("\n");
    sb.append("  matriculaMifare: ").append(matriculaMifare).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
