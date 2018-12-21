package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ProductDetails
 **/
@ApiModel(description = "ProductDetails")
public class ProdutoDetalhesResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("idFantasiaBasica")
  private Long idFantasiaBasica = null;
  @SerializedName("fantasiaBasica")
  private String fantasiaBasica = null;
  @SerializedName("usoExterior")
  private Boolean usoExterior = null;

  
  /**
   * Identification Code of the Product (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Product (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Name description of the product
   **/
  @ApiModelProperty(required = true, value = "Name description of the product")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Represent the status of the product, where: ('0': Inactive), ('1': Active
   **/
  @ApiModelProperty(required = true, value = "Represent the status of the product, where: ('0': Inactive), ('1': Active")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Identification Code of the Basic Fantasy (id) which the product belongs
   **/
  @ApiModelProperty(value = "Identification Code of the Basic Fantasy (id) which the product belongs")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Description of the Basic Fantasy which the product belongs
   **/
  @ApiModelProperty(value = "Description of the Basic Fantasy which the product belongs")
  public String getFantasiaBasica() {
    return fantasiaBasica;
  }
  public void setFantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
  }

  
  /**
   * Parameter that indicates if the product is enabled to shops abroad
   **/
  @ApiModelProperty(value = "Parameter that indicates if the product is enabled to shops abroad")
  public Boolean getUsoExterior() {
    return usoExterior;
  }
  public void setUsoExterior(Boolean usoExterior) {
    this.usoExterior = usoExterior;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoDetalhesResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idFantasiaBasica: ").append(idFantasiaBasica).append("\n");
    sb.append("  fantasiaBasica: ").append(fantasiaBasica).append("\n");
    sb.append("  usoExterior: ").append(usoExterior).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
