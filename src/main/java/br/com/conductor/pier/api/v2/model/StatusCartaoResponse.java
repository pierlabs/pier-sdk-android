package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{status_cartao_response_description}}}
 **/
@ApiModel(description = "{{{status_cartao_response_description}}}")
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
   * {{{status_cartao_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{status_cartao_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{status_cartao_response_nome_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{status_cartao_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{status_cartao_response_permite_desbloquear_value}}}
   **/
  @ApiModelProperty(value = "{{{status_cartao_response_permite_desbloquear_value}}}")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * {{{status_cartao_response_permite_atribuir_como_bloqueio_value}}}
   **/
  @ApiModelProperty(value = "{{{status_cartao_response_permite_atribuir_como_bloqueio_value}}}")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * {{{status_cartao_response_permite_atribuir_como_cancelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{status_cartao_response_permite_atribuir_como_cancelamento_value}}}")
  public Integer getPermiteAtribuirComoCancelamento() {
    return permiteAtribuirComoCancelamento;
  }
  public void setPermiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
  }

  
  /**
   * {{{status_cartao_response_cobrar_tarifa_ao_emitir_nova_via_value}}}
   **/
  @ApiModelProperty(value = "{{{status_cartao_response_cobrar_tarifa_ao_emitir_nova_via_value}}}")
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


