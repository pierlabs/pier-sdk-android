package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persist\u00EAncia de favorito de recarga de celular
 **/
@ApiModel(description = "Objeto de persist\u00EAncia de favorito de recarga de celular")
public class RecargaCelularFavoritoPersist  {
  
  @SerializedName("dddCelular")
  private String dddCelular = null;
  @SerializedName("numeroCelular")
  private String numeroCelular = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * DDD do celular
   **/
  @ApiModelProperty(required = true, value = "DDD do celular")
  public String getDddCelular() {
    return dddCelular;
  }
  public void setDddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
  }

  
  /**
   * N\u00FAmero do celular
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do celular")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  
  /**
   * Indicador de status
   **/
  @ApiModelProperty(value = "Indicador de status")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaCelularFavoritoPersist {\n");
    
    sb.append("  dddCelular: ").append(dddCelular).append("\n");
    sb.append("  numeroCelular: ").append(numeroCelular).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
