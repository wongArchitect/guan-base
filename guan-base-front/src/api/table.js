import request from '@/utils/request'

export function getList(params) {
  return request({
    url: '/guan-base-admin/table/list',
    method: 'get',
    params
  })
}
