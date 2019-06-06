package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para atualiza\u00E7\u00E3o de cart\u00F5es
 **/
@ApiModel(description = "Objeto para atualiza\u00E7\u00E3o de cart\u00F5es")
public class CartaoUpdate  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("sequencialCartao")
  private Integer sequencialCartao = null;
  @SerializedName("conta")
  private Long conta = null;
  @SerializedName("idStatusCartao")
  private Long idStatusCartao = null;
  @SerializedName("idEstagioCartao")
  private Long idEstagioCartao = null;
  @SerializedName("qtdSenhasIncorretas")
  private Integer qtdSenhasIncorretas = null;
  @SerializedName("arquivoImpressao")
  private String arquivoImpressao = null;

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador da pessoa
   **/
  @ApiModelProperty(value = "Identificador da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Sequencial do cart\u00E3o atual
   **/
  @ApiModelProperty(value = "Sequencial do cart\u00E3o atual")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * Conta do cart\u00E3o
   **/
  @ApiModelProperty(value = "Conta do cart\u00E3o")
  public Long getConta() {
    return conta;
  }
  public void setConta(Long conta) {
    this.conta = conta;
  }

  
  /**
   * Identificador do status do cart\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do status do cart\u00E3o")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Identificador do estagio de embossing do cart\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do estagio de embossing do cart\u00E3o")
  public Long getIdEstagioCartao() {
    return idEstagioCartao;
  }
  public void setIdEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
  }

  
  /**
   * Contador de senhas incorretas
   **/
  @ApiModelProperty(value = "Contador de senhas incorretas")
  public Integer getQtdSenhasIncorretas() {
    return qtdSenhasIncorretas;
  }
  public void setQtdSenhasIncorretas(Integer qtdSenhasIncorretas) {
    this.qtdSenhasIncorretas = qtdSenhasIncorretas;
  }

  
  /**
   * Nome do arquivo de embossing que o cart\u00E3o foi impresso
   **/
  @ApiModelProperty(value = "Nome do arquivo de embossing que o cart\u00E3o foi impresso")
  public String getArquivoImpressao() {
    return arquivoImpressao;
  }
  public void setArquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoUpdate {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  sequencialCartao: ").append(sequencialCartao).append("\n");
    sb.append("  conta: ").append(conta).append("\n");
    sb.append("  idStatusCartao: ").append(idStatusCartao).append("\n");
    sb.append("  idEstagioCartao: ").append(idEstagioCartao).append("\n");
    sb.append("  qtdSenhasIncorretas: ").append(qtdSenhasIncorretas).append("\n");
    sb.append("  arquivoImpressao: ").append(arquivoImpressao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
