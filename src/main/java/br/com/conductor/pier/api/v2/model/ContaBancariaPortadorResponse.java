package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ContaBancariaPortadorResponse  {
  
  @SerializedName("id")
  private Long id = null;
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
   * C\u00C3\u00B3digo identificador da conta banc\u00C3\u00A1ria
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da conta banc\u00C3\u00A1ria")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da conta cart\u00C3\u00A3o")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o da ag\u00C3\u00AAncia")
  public String getNomeAgencia() {
    return nomeAgencia;
  }
  public void setNomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
  }

  
  /**
   * C\u00C3\u00B3digo do banco
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00C3\u00BAmero da ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da ag\u00C3\u00AAncia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * D\u00C3\u00ADgito da ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito da ag\u00C3\u00AAncia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da conta
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da conta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * D\u00C3\u00ADgito da conta
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito da conta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Sinaliza se conta banc\u00C3\u00A1ria est\u00C3\u00A1 ativa ou n\u00C3\u00A3o (1: Ativa, 0: Inativa)
   **/
  @ApiModelProperty(value = "Sinaliza se conta banc\u00C3\u00A1ria est\u00C3\u00A1 ativa ou n\u00C3\u00A3o (1: Ativa, 0: Inativa)")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Sinaliza se origem \u00C3\u00A9 DOC (1: DOC, 0: TED)
   **/
  @ApiModelProperty(value = "Sinaliza se origem \u00C3\u00A9 DOC (1: DOC, 0: TED)")
  public Integer getFlagContaOrigemDoc() {
    return flagContaOrigemDoc;
  }
  public void setFlagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
  }

  
  /**
   * C\u00C3\u00B3digo da pessoa
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo da pessoa")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * Sinaliza se conta banc\u00C3\u00A1ria \u00C3\u00A9 poupan\u00C3\u00A7a (1: Poupan\u00C3\u00A7a, 0: Conta corrente)
   **/
  @ApiModelProperty(value = "Sinaliza se conta banc\u00C3\u00A1ria \u00C3\u00A9 poupan\u00C3\u00A7a (1: Poupan\u00C3\u00A7a, 0: Conta corrente)")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Nome do favorecido
   **/
  @ApiModelProperty(value = "Nome do favorecido")
  public String getFavorecido() {
    return favorecido;
  }
  public void setFavorecido(String favorecido) {
    this.favorecido = favorecido;
  }

  
  /**
   * Documento do favorecido
   **/
  @ApiModelProperty(value = "Documento do favorecido")
  public String getNumeroReceiraFederal() {
    return numeroReceiraFederal;
  }
  public void setNumeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
  }

  
  /**
   * Titularidade da conta (1:Portador \u00C3\u00A9 o titular, 0: Portador n\u00C3\u00A3o \u00C3\u00A9 o t\u00C3\u00ADtular
   **/
  @ApiModelProperty(value = "Titularidade da conta (1:Portador \u00C3\u00A9 o titular, 0: Portador n\u00C3\u00A3o \u00C3\u00A9 o t\u00C3\u00ADtular")
  public Integer getTitularidade() {
    return titularidade;
  }
  public void setTitularidade(Integer titularidade) {
    this.titularidade = titularidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaBancariaPortadorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
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


