package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto AplicacaoMobile
 **/
@ApiModel(description = "Objeto AplicacaoMobile")
public class AplicacaoMobileUpdate  {
  
  @SerializedName("token")
  private String token = null;
  @SerializedName("cor")
  private String cor = null;
  @SerializedName("som")
  private String som = null;
  @SerializedName("icone")
  private String icone = null;
  @SerializedName("certificado")
  private String certificado = null;
  @SerializedName("senha")
  private String senha = null;

  
  /**
   * Token da Aplicacao Mobile
   **/
  @ApiModelProperty(value = "Token da Aplicacao Mobile")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Cor da Mensagem da Aplicacao Mobile
   **/
  @ApiModelProperty(value = "Cor da Mensagem da Aplicacao Mobile")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * Som da Mensagem da Aplicacao Mobile
   **/
  @ApiModelProperty(value = "Som da Mensagem da Aplicacao Mobile")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Icone da Mensagem da Aplicacao Mobile
   **/
  @ApiModelProperty(value = "Icone da Mensagem da Aplicacao Mobile")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Certificado da Aplicacao Mobile
   **/
  @ApiModelProperty(value = "Certificado da Aplicacao Mobile")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * Senha da Aplicacao Mobile
   **/
  @ApiModelProperty(value = "Senha da Aplicacao Mobile")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileUpdate {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  cor: ").append(cor).append("\n");
    sb.append("  som: ").append(som).append("\n");
    sb.append("  icone: ").append(icone).append("\n");
    sb.append("  certificado: ").append(certificado).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
