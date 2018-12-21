package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of Card Status Resource
 **/
@ApiModel(description = "Representation of Card Status Resource")
public class StatusCartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("permiteDesbloquear")
  private Integer permiteDesbloquear = null;
  @SerializedName("permiteAtribuirComoBloqueio")
  private Integer permiteAtribuirComoBloqueio = null;
  @SerializedName("permiteAtribuirComoCancelamento")
  private Integer permiteAtribuirComoCancelamento = null;
  @SerializedName("cobrarTarifaAoEmitirNovaVia")
  private Integer cobrarTarifaAoEmitirNovaVia = null;

  
  /**
   * Identification Code of the Card Status (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Card Status (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Name attributed to the status of the Card Delivery
   **/
  @ApiModelProperty(required = true, value = "Name attributed to the status of the Card Delivery")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Parameter that define if the status of the card allows the reactivation of the card, being: 0: Inactive and 1: Active
   **/
  @ApiModelProperty(value = "Parameter that define if the status of the card allows the reactivation of the card, being: 0: Inactive and 1: Active")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * Parameter that define if the status of the card allows the reactivation of the card, being: 0: Inactive and 1: Active
   **/
  @ApiModelProperty(value = "Parameter that define if the status of the card allows the reactivation of the card, being: 0: Inactive and 1: Active")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * Parameter that define if the status of the card allows the reactivation of the card, being: 0: Inactive and 1: Active
   **/
  @ApiModelProperty(value = "Parameter that define if the status of the card allows the reactivation of the card, being: 0: Inactive and 1: Active")
  public Integer getPermiteAtribuirComoCancelamento() {
    return permiteAtribuirComoCancelamento;
  }
  public void setPermiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
  }

  
  /**
   * Parameter that define if the status of the card allows the reactivation of the card, being: 0: Inactive and 1: Active
   **/
  @ApiModelProperty(value = "Parameter that define if the status of the card allows the reactivation of the card, being: 0: Inactive and 1: Active")
  public Integer getCobrarTarifaAoEmitirNovaVia() {
    return cobrarTarifaAoEmitirNovaVia;
  }
  public void setCobrarTarifaAoEmitirNovaVia(Integer cobrarTarifaAoEmitirNovaVia) {
    this.cobrarTarifaAoEmitirNovaVia = cobrarTarifaAoEmitirNovaVia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  permiteDesbloquear: ").append(permiteDesbloquear).append("\n");
    sb.append("  permiteAtribuirComoBloqueio: ").append(permiteAtribuirComoBloqueio).append("\n");
    sb.append("  permiteAtribuirComoCancelamento: ").append(permiteAtribuirComoCancelamento).append("\n");
    sb.append("  cobrarTarifaAoEmitirNovaVia: ").append(cobrarTarifaAoEmitirNovaVia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
