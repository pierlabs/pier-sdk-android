package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{plano_campanha_update_description}}}
 **/
@ApiModel(description = "{{{plano_campanha_update_description}}}")
public class PlanoCampanhaUpdateValue  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("parcelas")
  private Integer parcelas = null;
  @SerializedName("taxa")
  private BigDecimal taxa = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   * {{{plano_campanha_update_id_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_campanha_update_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{plano_campanha_update_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_campanha_update_parcelas_value}}}")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   * {{{plano_campanha_update_taxa_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_campanha_update_taxa_value}}}")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  
  /**
   * {{{plano_campanha_update_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_campanha_update_usuario_value}}}")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoCampanhaUpdateValue {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  parcelas: ").append(parcelas).append("\n");
    sb.append("  taxa: ").append(taxa).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


