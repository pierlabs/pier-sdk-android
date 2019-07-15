package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto da atualiza\u00E7\u00E3o parcial de favorito de recarga de celular
 **/
@ApiModel(description = "Objeto da atualiza\u00E7\u00E3o parcial de favorito de recarga de celular")
public class RecargaCelularFavoritoParcialUpdate  {
  
  @SerializedName("dddCelular")
  private String dddCelular = null;
  @SerializedName("numeroCelular")
  private String numeroCelular = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("descricaoOperadora")
  private String descricaoOperadora = null;

  
  /**
   * DDD do celular
   **/
  @ApiModelProperty(value = "DDD do celular")
  public String getDddCelular() {
    return dddCelular;
  }
  public void setDddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
  }

  
  /**
   * N\u00FAmero do celular
   **/
  @ApiModelProperty(value = "N\u00FAmero do celular")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  
  /**
   * Nome do propriet\u00E1rio do celular
   **/
  @ApiModelProperty(value = "Nome do propriet\u00E1rio do celular")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Indicador de status do favorito
   **/
  @ApiModelProperty(value = "Indicador de status do favorito")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Descri\u00E7\u00E3o da operadora
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da operadora")
  public String getDescricaoOperadora() {
    return descricaoOperadora;
  }
  public void setDescricaoOperadora(String descricaoOperadora) {
    this.descricaoOperadora = descricaoOperadora;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaCelularFavoritoParcialUpdate {\n");
    
    sb.append("  dddCelular: ").append(dddCelular).append("\n");
    sb.append("  numeroCelular: ").append(numeroCelular).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  descricaoOperadora: ").append(descricaoOperadora).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
