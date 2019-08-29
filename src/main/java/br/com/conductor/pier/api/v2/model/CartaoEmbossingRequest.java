package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Parametros de requisi\u00E7\u00E3o da gera\u00E7\u00E3o do cart\u00E3o embossing
 **/
@ApiModel(description = "Parametros de requisi\u00E7\u00E3o da gera\u00E7\u00E3o do cart\u00E3o embossing")
public class CartaoEmbossingRequest  {
  
  @SerializedName("id_pessoa")
  private Long idPessoa = null;
  @SerializedName("id_tipo_plastico")
  private Long idTipoPlastico = null;
  @SerializedName("idImagem")
  private Long idImagem = null;
  @SerializedName("idMifare")
  private Long idMifare = null;
  @SerializedName("matriculaMifare")
  private String matriculaMifare = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o cart\u00E3o pertence (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o cart\u00E3o pertence (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do TipoPlastico (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do TipoPlastico (id)")
  public Long getIdTipoPlastico() {
    return idTipoPlastico;
  }
  public void setIdTipoPlastico(Long idTipoPlastico) {
    this.idTipoPlastico = idTipoPlastico;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da imagem (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da imagem (id)")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
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
    sb.append("class CartaoEmbossingRequest {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idTipoPlastico: ").append(idTipoPlastico).append("\n");
    sb.append("  idImagem: ").append(idImagem).append("\n");
    sb.append("  idMifare: ").append(idMifare).append("\n");
    sb.append("  matriculaMifare: ").append(matriculaMifare).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
