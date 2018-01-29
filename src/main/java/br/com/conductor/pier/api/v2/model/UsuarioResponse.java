package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Usuario
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Usuario")
public class UsuarioResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("email")
  private String email = null;
  public enum StatusEnum {
     INATIVO,  ATIVO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("dataCriacao")
  private String dataCriacao = null;
  @SerializedName("dataModificacao")
  private String dataModificacao = null;
  @SerializedName("tentativasIncorretas")
  private Long tentativasIncorretas = null;

  
  /**
   * Id do Usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "Id do Usu\u00C3\u00A1rio")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do Usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "Nome do Usu\u00C3\u00A1rio")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Login do Usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(required = true, value = "Login do Usu\u00C3\u00A1rio")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Id do emissor do usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "Id do emissor do usu\u00C3\u00A1rio")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * CPF do Usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "CPF do Usu\u00C3\u00A1rio")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Email do Usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(required = true, value = "Email do Usu\u00C3\u00A1rio")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Status do Usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "Status do Usu\u00C3\u00A1rio")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Data de cria\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "Data de cria\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * Data de modifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "Data de modifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio")
  public String getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  
  /**
   * N\u00C3\u00BAmero de tentativas de valida\u00C3\u00A7\u00C3\u00A3o incorretas
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero de tentativas de valida\u00C3\u00A7\u00C3\u00A3o incorretas")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataCriacao: ").append(dataCriacao).append("\n");
    sb.append("  dataModificacao: ").append(dataModificacao).append("\n");
    sb.append("  tentativasIncorretas: ").append(tentativasIncorretas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
