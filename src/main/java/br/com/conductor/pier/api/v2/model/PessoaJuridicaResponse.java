package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de pessoa jur\u00C3\u00ADdica
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de pessoa jur\u00C3\u00ADdica")
public class PessoaJuridicaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("banco")
  private Integer banco = null;
  @SerializedName("agencia")
  private Integer agencia = null;
  @SerializedName("digitoVerificadorAgencia")
  private String digitoVerificadorAgencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("digitoVerificadorContaCorrente")
  private String digitoVerificadorContaCorrente = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   * C\u00C3\u00B3digo identificador da pessoa jur\u00C3\u00ADdica
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da pessoa jur\u00C3\u00ADdica")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   **/
  @ApiModelProperty(value = "Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * C\u00C3\u00B3digo do Cadastro Nacional de Pessoas Jur\u00C3\u00ADdicas
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do Cadastro Nacional de Pessoas Jur\u00C3\u00ADdicas")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Nome da pessoa para entrar em contato
   **/
  @ApiModelProperty(value = "Nome da pessoa para entrar em contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * C\u00C3\u00B3digo do banco
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * C\u00C3\u00B3digo da ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo da ag\u00C3\u00AAncia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00C3\u00ADgito verificador da ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito verificador da ag\u00C3\u00AAncia")
  public String getDigitoVerificadorAgencia() {
    return digitoVerificadorAgencia;
  }
  public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
    this.digitoVerificadorAgencia = digitoVerificadorAgencia;
  }

  
  /**
   * C\u00C3\u00B3digo da Conta Corrente
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo da Conta Corrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00C3\u00ADgito Verificador da Conta Corrente
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito Verificador da Conta Corrente")
  public String getDigitoVerificadorContaCorrente() {
    return digitoVerificadorContaCorrente;
  }
  public void setDigitoVerificadorContaCorrente(String digitoVerificadorContaCorrente) {
    this.digitoVerificadorContaCorrente = digitoVerificadorContaCorrente;
  }

  
  /**
   * Login do usu\u00C3\u00A1rio para registro da inser\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Login do usu\u00C3\u00A1rio para registro da inser\u00C3\u00A7\u00C3\u00A3o")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoVerificadorAgencia: ").append(digitoVerificadorAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoVerificadorContaCorrente: ").append(digitoVerificadorContaCorrente).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
