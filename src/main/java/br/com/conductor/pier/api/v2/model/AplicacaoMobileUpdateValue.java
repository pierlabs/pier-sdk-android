package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{aplicacao_mobile_update_description}}}
 **/
@ApiModel(description = "{{{aplicacao_mobile_update_description}}}")
public class AplicacaoMobileUpdateValue  {
  
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
   * {{{aplicacao_mobile_update_token_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_update_token_value}}}")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{aplicacao_mobile_update_cor_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_update_cor_value}}}")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * {{{aplicacao_mobile_update_som_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_update_som_value}}}")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * {{{aplicacao_mobile_update_icone_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_update_icone_value}}}")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * {{{aplicacao_mobile_update_certificado_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_update_certificado_value}}}")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * {{{aplicacao_mobile_update_senha_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_update_senha_value}}}")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileUpdateValue {\n");
    
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


