package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{conta_bancaria_portador_persist_description}}}
 **/
@ApiModel(description = "{{{conta_bancaria_portador_persist_description}}}")
public class ContaBancariaPortadorPersistValue  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("nomeAgencia")
  private String nomeAgencia = null;
  @SerializedName("banco")
  private Long banco = null;
  @SerializedName("numeroAgencia")
  private String numeroAgencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("numeroConta")
  private String numeroConta = null;
  @SerializedName("digitoConta")
  private String digitoConta = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("flagContaOrigemDoc")
  private Integer flagContaOrigemDoc = null;
  @SerializedName("idPessoaFisica")
  private Long idPessoaFisica = null;
  @SerializedName("flagContaPoupanca")
  private Integer flagContaPoupanca = null;
  @SerializedName("favorecido")
  private String favorecido = null;
  @SerializedName("numeroReceiraFederal")
  private String numeroReceiraFederal = null;
  @SerializedName("titularidade")
  private Integer titularidade = null;

  
  /**
   * {{{conta_bancaria_portador_persist_id_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_bancaria_portador_persist_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_nome_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_bancaria_portador_persist_nome_agencia_value}}}")
  public String getNomeAgencia() {
    return nomeAgencia;
  }
  public void setNomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_banco_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_bancaria_portador_persist_banco_value}}}")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_numero_agencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_bancaria_portador_persist_numero_agencia_value}}}")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_digito_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_bancaria_portador_persist_digito_agencia_value}}}")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_numero_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_bancaria_portador_persist_numero_conta_value}}}")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_digito_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_bancaria_portador_persist_digito_conta_value}}}")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_flag_ativo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_bancaria_portador_persist_flag_ativo_value}}}")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_flag_conta_origem_doc_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_bancaria_portador_persist_flag_conta_origem_doc_value}}}")
  public Integer getFlagContaOrigemDoc() {
    return flagContaOrigemDoc;
  }
  public void setFlagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_id_pessoa_fisica_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_bancaria_portador_persist_id_pessoa_fisica_value}}}")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_flag_conta_poupanca_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_bancaria_portador_persist_flag_conta_poupanca_value}}}")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_favorecido_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_bancaria_portador_persist_favorecido_value}}}")
  public String getFavorecido() {
    return favorecido;
  }
  public void setFavorecido(String favorecido) {
    this.favorecido = favorecido;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_numero_receira_federal_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_bancaria_portador_persist_numero_receira_federal_value}}}")
  public String getNumeroReceiraFederal() {
    return numeroReceiraFederal;
  }
  public void setNumeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
  }

  
  /**
   * {{{conta_bancaria_portador_persist_titularidade_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_bancaria_portador_persist_titularidade_value}}}")
  public Integer getTitularidade() {
    return titularidade;
  }
  public void setTitularidade(Integer titularidade) {
    this.titularidade = titularidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaBancariaPortadorPersistValue {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nomeAgencia: ").append(nomeAgencia).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  numeroConta: ").append(numeroConta).append("\n");
    sb.append("  digitoConta: ").append(digitoConta).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  flagContaOrigemDoc: ").append(flagContaOrigemDoc).append("\n");
    sb.append("  idPessoaFisica: ").append(idPessoaFisica).append("\n");
    sb.append("  flagContaPoupanca: ").append(flagContaPoupanca).append("\n");
    sb.append("  favorecido: ").append(favorecido).append("\n");
    sb.append("  numeroReceiraFederal: ").append(numeroReceiraFederal).append("\n");
    sb.append("  titularidade: ").append(titularidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
