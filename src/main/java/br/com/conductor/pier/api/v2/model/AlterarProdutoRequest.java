package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{alterar_produto_request_description}}}
 **/
@ApiModel(description = "{{{alterar_produto_request_description}}}")
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
   * {{{alterar_produto_request_id_produto_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{alterar_produto_request_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{alterar_produto_request_id_origem_comercial_value}}}
   **/
  @ApiModelProperty(value = "{{{alterar_produto_request_id_origem_comercial_value}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{alterar_produto_request_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{alterar_produto_request_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{alterar_produto_request_id_promotor_value}}}
   **/
  @ApiModelProperty(value = "{{{alterar_produto_request_id_promotor_value}}}")
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
