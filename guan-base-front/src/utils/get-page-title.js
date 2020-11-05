import defaultSettings from '@/settings'

const title = defaultSettings.title || 'GUAN论基础系统'

export default function getPageTitle(pageTitle) {
  if (pageTitle) {
    return `${pageTitle} - ${title}`
  }
  return `${title}`
}
