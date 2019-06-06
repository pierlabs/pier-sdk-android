package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta para favoritos de recarga de celular 
 **/
@ApiModel(description = "Objeto de resposta para favoritos de recarga de celular ")
public class RecargaCelularFavoritoResponse  {
  
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("dddCelular")
  private String dddCelular = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("numeroCelular")
  private String numeroCelular = null;

  
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
   * N\u00FAmero DDD do favorito
   **/
  @ApiModelProperty(value = "N\u00FAmero DDD do favorito")
  public String getDddCelular() {
    return dddCelular;
  }
  public void setDddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
  }

  
  /**
   * Identificador do favorito
   **/
  @ApiModelProperty(value = "Identificador do favorito")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Nome do favorito
   **/
  @ApiModelProperty(value = "Nome do favorito")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * N\u00FAmero do celular do favorito
   **/
  @ApiModelProperty(value = "N\u00FAmero do celular do favorito")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaCelularFavoritoResponse {\n");
    
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  dddCelular: ").append(dddCelular).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  numeroCelular: ").append(numeroCelular).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
