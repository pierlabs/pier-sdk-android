package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Application Mobile
 **/
@ApiModel(description = "Application Mobile")
public class AplicacaoMobileResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPlataformaMobile")
  private Long idPlataformaMobile = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("cor")
  private String cor = null;
  @SerializedName("som")
  private String som = null;
  @SerializedName("icone")
  private String icone = null;
  @SerializedName("certificadoBase64")
  private String certificadoBase64 = null;
  @SerializedName("senha")
  private String senha = null;

  
  /**
   * Show the identifier of the application
   **/
  @ApiModelProperty(value = "Show the identifier of the application")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * show the identifier of the platform
   **/
  @ApiModelProperty(value = "show the identifier of the platform")
  public Long getIdPlataformaMobile() {
    return idPlataformaMobile;
  }
  public void setIdPlataformaMobile(Long idPlataformaMobile) {
    this.idPlataformaMobile = idPlataformaMobile;
  }

  
  /**
   * Show the token application
   **/
  @ApiModelProperty(value = "Show the token application")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Show the message color of the application
   **/
  @ApiModelProperty(value = "Show the message color of the application")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * show the message sound of the application
   **/
  @ApiModelProperty(value = "show the message sound of the application")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Show the message icon of the application
   **/
  @ApiModelProperty(value = "Show the message icon of the application")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Show the certificate of the application
   **/
  @ApiModelProperty(value = "Show the certificate of the application")
  public String getCertificadoBase64() {
    return certificadoBase64;
  }
  public void setCertificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
  }

  
  /**
   * Show the password of the application
   **/
  @ApiModelProperty(value = "Show the password of the application")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPlataformaMobile: ").append(idPlataformaMobile).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  cor: ").append(cor).append("\n");
    sb.append("  som: ").append(som).append("\n");
    sb.append("  icone: ").append(icone).append("\n");
    sb.append("  certificadoBase64: ").append(certificadoBase64).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
