package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Representation of the device resource
 **/
@ApiModel(description = "Request Representation of the device resource")
public class AlterarProdutoRequest  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idPromotor")
  private Long idPromotor = null;

  
  /**
   * Identifier Code of the product
   **/
  @ApiModelProperty(required = true, value = "Identifier Code of the product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identifier Code of the commercial origin
   **/
  @ApiModelProperty(value = "Identifier Code of the commercial origin")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * It must be filled out with the idEstablishment where the Grade was made. When it is not informed, it is recorded with the idEstablishment associated to the Commercial Origin that captured the initial register of the account
   **/
  @ApiModelProperty(value = "It must be filled out with the idEstablishment where the Grade was made. When it is not informed, it is recorded with the idEstablishment associated to the Commercial Origin that captured the initial register of the account")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * It must be filled out with the idCode of the Prosecutor where the Grade was made. When it is not informed, it is recorded a standard identification code
   **/
  @ApiModelProperty(value = "It must be filled out with the idCode of the Prosecutor where the Grade was made. When it is not informed, it is recorded a standard identification code")
  public Long getIdPromotor() {
    return idPromotor;
  }
  public void setIdPromotor(Long idPromotor) {
    this.idPromotor = idPromotor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlterarProdutoRequest {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idPromotor: ").append(idPromotor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
