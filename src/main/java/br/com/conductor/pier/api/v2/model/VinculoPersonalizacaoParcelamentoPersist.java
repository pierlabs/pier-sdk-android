package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de cria\u00E7\u00E3o de um v\u00EDnculo entre uma conta e um parcelamento personalizado
 **/
@ApiModel(description = "Objeto de cria\u00E7\u00E3o de um v\u00EDnculo entre uma conta e um parcelamento personalizado")
public class VinculoPersonalizacaoParcelamentoPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPersonalizacaoParcelamento")
  private Long idPersonalizacaoParcelamento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta que ser\u00E1 vinculada ao parcelamento personalizado
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta que ser\u00E1 vinculada ao parcelamento personalizado")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da personaliza\u00E7\u00E3o de parcelamento que ser\u00E1 vinculada \u00E0 conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da personaliza\u00E7\u00E3o de parcelamento que ser\u00E1 vinculada \u00E0 conta")
  public Long getIdPersonalizacaoParcelamento() {
    return idPersonalizacaoParcelamento;
  }
  public void setIdPersonalizacaoParcelamento(Long idPersonalizacaoParcelamento) {
    this.idPersonalizacaoParcelamento = idPersonalizacaoParcelamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoPersonalizacaoParcelamentoPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPersonalizacaoParcelamento: ").append(idPersonalizacaoParcelamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
