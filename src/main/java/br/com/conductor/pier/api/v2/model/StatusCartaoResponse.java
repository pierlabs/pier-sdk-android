package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Status Cart\u00C3\u00A3o")
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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) 
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) ")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteDesbloquear() {
    return permiteDesbloquear;
  }
  public void setPermiteDesbloquear(Integer permiteDesbloquear) {
    this.permiteDesbloquear = permiteDesbloquear;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteAtribuirComoBloqueio() {
    return permiteAtribuirComoBloqueio;
  }
  public void setPermiteAtribuirComoBloqueio(Integer permiteAtribuirComoBloqueio) {
    this.permiteAtribuirComoBloqueio = permiteAtribuirComoBloqueio;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.")
  public Integer getPermiteAtribuirComoCancelamento() {
    return permiteAtribuirComoCancelamento;
  }
  public void setPermiteAtribuirComoCancelamento(Integer permiteAtribuirComoCancelamento) {
    this.permiteAtribuirComoCancelamento = permiteAtribuirComoCancelamento;
  }

  
  /**
   * Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(value = "Par\u00C3\u00A2metro que define se o status do cart\u00C3\u00A3o permite a reativa\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o, sendo: 0: Inativo e 1: Ativo.")
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
